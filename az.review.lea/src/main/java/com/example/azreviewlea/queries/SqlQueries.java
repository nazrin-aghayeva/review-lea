package com.example.azreviewlea.queries;

public abstract class SqlQueries {
    public static final String GET_USER ="select gmail, password, is_active from authentication_info where gmail=?";
    public static final String GET_ROLE ="select gmail,authority from authorities where gmail = ?";
}
