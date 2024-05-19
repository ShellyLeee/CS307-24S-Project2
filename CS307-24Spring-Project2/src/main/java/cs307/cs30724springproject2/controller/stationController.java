package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.station;
import cs307.cs30724springproject2.service.stationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.List;

@Controller //相比RestController：返回一个html界面
@RequestMapping("/station")
public class stationController {
    @Autowired
    private stationService stationService;

    @GetMapping(value = "/selectById",produces = "application/json;charset=utf-8")
    public String selectById(@RequestParam int id, Model model) {
        // 根据 id 查询站点信息，并将信息存入 model 中
        station stationT = stationService.findStationById(id);
        model.addAttribute("station", stationT);
        return "stationInfo"; // 返回站点信息的HTML页面
    }
}
