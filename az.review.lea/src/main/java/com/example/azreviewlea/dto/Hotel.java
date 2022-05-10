package com.example.azreviewlea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "ranking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String hotel;

    private Integer rate;
}
