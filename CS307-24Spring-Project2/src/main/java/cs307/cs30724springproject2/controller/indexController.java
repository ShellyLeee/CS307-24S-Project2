package cs307.cs30724springproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index"; // 返回 index.html 页面
    }
}


