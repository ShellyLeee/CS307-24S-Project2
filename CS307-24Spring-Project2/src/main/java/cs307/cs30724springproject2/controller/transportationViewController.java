package cs307.cs30724springproject2.controller;
import cs307.cs30724springproject2.entity.transportationView;
import cs307.cs30724springproject2.service.transportationViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class transportationViewController {
    @Autowired
    private transportationViewService transportationViewService;

    @GetMapping(value = "/transportationView", produces = "application/json;charset=utf-8")
    public String findAllTransInfo(@RequestParam("stationName") String stationName, @RequestParam("exit") String exit, Model model) {
        transportationView tV = transportationViewService.findTransInfo(stationName,exit);
        model.addAttribute("transportationView", tV);
        return "transInfo";
    }
}
