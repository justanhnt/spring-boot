package com.learning.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by justanhnt on 7/24/21
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String searchView() {
        return "search";
    }

    private static final Random RANDOM = new Random();

    @PostMapping("/search")
    public ModelAndView searchFunctionView(@RequestParam("term") String term, ModelAndView mav) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            ans.add(term + " " + (RANDOM.nextInt(26) + 'a'));
        }
        mav.addObject("results", ans);
        mav.setViewName("result");
        return mav;
    }
}
