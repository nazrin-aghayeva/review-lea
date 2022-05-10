package com.example.azreviewlea.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "authentication_info", schema = "review_lea")
public class LoginEntity {
//    @Id
    private String id;
    private String gmail;
    private String password;
    private LocalDateTime lastLogin;
    private LocalDateTime updateDate;
}
