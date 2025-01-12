package org.example.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/") //this is the request
    public String home(){  //call this method
        System.out.println("home");
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){ //transfer between controller and the jsp - model
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }
}
