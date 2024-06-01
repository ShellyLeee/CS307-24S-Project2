package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.businessPrice;
import cs307.cs30724springproject2.service.businessPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/businessPrice")
public class businessPriceController {
    @Autowired
    public businessPriceService businessPriceService;

    @GetMapping(value = "/selectByStations", produces = "application/json;charset=utf-8")
    public businessPrice selectByStations(@RequestParam String start, String end, Model model){
        // 这里要改
        businessPrice businessPrice = businessPriceService.getprice(start, end);
        model.addAttribute("businessPrice", businessPrice);
        return businessPrice;
    }
}
