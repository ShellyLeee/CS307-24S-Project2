package cs307.cs30724springproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("/admin")
    public String admin() {
        return "admin"; // 返回 admin.html 页面
    }

    @GetMapping("/passenger")
    public String passenger() {
        return "passenger"; // 返回 passenger.html 页面
    }

    @GetMapping("/script")
    public String script() {
        return "script"; // 返回 script.html 页面
    }
}
