package com.example.azreviewlea.controller;

import com.example.azreviewlea.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainPageController {
    private final MainService mainService;
}
