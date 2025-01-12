package org.example.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/") //this is the request
    public String home(){  //call this method
        System.out.println("home");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){ //transfer between controller and the jsp - model
        int result = num1 + num2;
        model.addAttribute("result", result);
        System.out.println("result: " + result);
        return "result.jsp";
    }
}
