package com.example.azreviewlea.configuration;


import com.example.azreviewlea.queries.SqlQueries;
import javax.sql.DataSource;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.
                jdbcAuthentication()
                .usersByUsernameQuery(SqlQueries.GET_USER)
                .authoritiesByUsernameQuery(SqlQueries.GET_ROLE)
                .dataSource(dataSource)
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/registration", "/forgot-password", "/reset-password", "/confirm-account").permitAll()
                .antMatchers("/", "/resources/**").permitAll()
                .anyRequest().authenticated();
        http
                .formLogin()
                .loginPage("/authentication")
                .defaultSuccessUrl("/test")
                .failureUrl("/login?error=true")
                .usernameParameter("email")
                .passwordParameter("password")
                .permitAll();
        http
                .logout()
                .permitAll()
                .logoutSuccessUrl("/")
                .and().csrf().disable(); // disable CSRF

        http
                .rememberMe()
                .key("myUniqueKey")
                .tokenValiditySeconds(10000000);
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/img/**");
    }

}