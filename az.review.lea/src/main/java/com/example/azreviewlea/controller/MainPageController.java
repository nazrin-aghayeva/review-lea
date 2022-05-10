package com.example.azreviewlea.controller;

import com.example.azreviewlea.dto.Hotel;
import com.example.azreviewlea.service.MainService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class MainPageController {
    private final MainService mainService;

    @GetMapping("/list")
    public ModelAndView showDesignForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main-page");
        return modelAndView;
    }

    @GetMapping("/like")
    public ModelAndView addLike(Model model, @RequestParam("hotel") Integer id){
        model.addAttribute("hotel", id);
//        mainService.addLike(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("performance");
        return modelAndView;
    }

    @GetMapping("/data")
    public List<Hotel> getHotels(){
          return mainService.rank();
    }

}
