create table review_lea.authorities
(
    id          varchar(255) not null
        constraint authentication_rule_pkey
            primary key,
    gmail       varchar(255),
    authority varchar
);


