package com.example.azreviewlea.controller;

import com.example.azreviewlea.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/")
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/authentication")
    public ModelAndView signUp(Model model, @RequestParam(required = false) String email) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        model.addAttribute(email);
        loginService.updateAuthInformation(email);
        return modelAndView;
    }

    @GetMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
