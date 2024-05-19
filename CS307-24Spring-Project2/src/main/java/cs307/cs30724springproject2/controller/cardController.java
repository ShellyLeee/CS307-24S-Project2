package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.card;
import cs307.cs30724springproject2.service.cardService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController //注解：把数据返回到前端
@RequestMapping("/card")
public class cardController {

    @Autowired
    private cardService cardService;

    @GetMapping("/selectAll") //注解：告诉前端地址
    public List<card> getAllCard(){
        return cardService.selectAll();
    }
}
