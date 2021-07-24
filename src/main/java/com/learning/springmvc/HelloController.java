package com.learning.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Created by justanhnt on 7/24/21
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String searchView() {
        return "search.html";
    }

    private static final Random RANDOM = new Random();

    @PostMapping("/search")
    public ModelAndView searchFunctionView(@RequestParam("term") String term, ModelAndView mav) {
        // consider return ResponseBody for dynamic response

        mav.setViewName("result.html");

        return mav;
    }
}
