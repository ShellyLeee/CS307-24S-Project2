package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.card;
import cs307.cs30724springproject2.service.cardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController //注解：把数据返回到前端
public class cardController {

    @Autowired
    private cardService cardService;

    @RequestMapping("/selectAll") //注解：告诉前端地址
    public List<card> getAllCard(){
        return cardService.selectAll();
    }
    // 接口
    // 接口返回的地址：http://localhost:8080/getName
    // 结构返回的数据：{"name":"dog","age":5}

}
