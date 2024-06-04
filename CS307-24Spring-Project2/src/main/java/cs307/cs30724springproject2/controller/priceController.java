package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.price;
import cs307.cs30724springproject2.entity.station;
import cs307.cs30724springproject2.service.priceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/price")
public class priceController {
    @Autowired
    public priceService priceService;

    @GetMapping(value = "/selectByStations", produces = "application/json;charset=utf-8")
    public price selectByStations(@RequestParam String start,
                                  @RequestParam String end, Model model){
        // 这里要改
        price price = priceService.getprice(start, end);
        model.addAttribute("price", price);
        return price;
    }
}
