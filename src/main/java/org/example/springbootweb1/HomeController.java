package org.example.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/") //this is the request
    public String home(){  //call this method
        System.out.println("home");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest req){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println("result: " + result);
        return "result.jsp";
    }
}
