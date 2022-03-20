create table review_lea.authentication_info
(
    id          varchar(255) not null
        constraint authentication_info_pkey
            primary key,
    gmail       varchar(255),
    last_login  timestamp,
    password    varchar(255),
    update_date timestamp
);


