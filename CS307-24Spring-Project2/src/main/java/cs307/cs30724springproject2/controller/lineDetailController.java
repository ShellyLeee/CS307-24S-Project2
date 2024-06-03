package cs307.cs30724springproject2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cs307.cs30724springproject2.service.lineDetailService;

import java.util.Map;

@RestController
public class lineDetailController {
    @Autowired
    private lineDetailService lineDetailService;

    @PostMapping("/updateInsertStationNoBehind")
    public void updateInsertStationNoBehind(@RequestBody Map<String, Object> parameters) {
        int n = (int) parameters.get("n");
        String lineName = (String) parameters.get("lineName");
        String stationName = (String) parameters.get("stationName");
        lineDetailService.updateInsertStationNoBehind(n, lineName, stationName);
    }

    @PostMapping("/updateInsertStationNoFront")
    public void updateInsertStationNoFront(@RequestBody Map<String, Object> parameters) {
        int n = (int) parameters.get("n");
        String lineName = (String) parameters.get("lineName");
        String stationName = (String) parameters.get("stationName");
        lineDetailService.updateInsertStationNoFront(n, lineName, stationName);
    }
}
