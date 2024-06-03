package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cs307.cs30724springproject2.service.lineDetailService;

import java.util.List;
import java.util.Map;

@RestController
public class lineDetailController {
    @Autowired
    private lineDetailService lineDetailService;

    @PostMapping("/updateInsertStationNoBehind")
    public void updateInsertStationNoBehind(@RequestBody Map<String, Object> parameters) {
        String strN = (String) parameters.get("n");
        int n = Integer.parseInt(strN);
        String lineName = (String) parameters.get("lineName");
        String stationName = (String) parameters.get("stationName");
        lineDetailService.updateInsertStationNoBehind(n, lineName, stationName);
    }

    @PostMapping("/insertMultipleStationsBehind")
    public void insertMultipleStations(@RequestBody Map<String, Object> request) {
        String lineName = (String) request.get("lineName");
        List<Map<String, Object>> stations = (List<Map<String, Object>>) request.get("stations");
        lineDetailService.insertMultipleStationsBehind(lineName, stations);
    }


    @PostMapping("/updateInsertStationNoFront")
    public void updateInsertStationNoFront(@RequestBody Map<String, Object> parameters) {
        String strN = (String) parameters.get("n");
        int n = Integer.parseInt(strN);
        String lineName = (String) parameters.get("lineName");
        String stationName = (String) parameters.get("stationName");
        lineDetailService.updateInsertStationNoFront(n, lineName, stationName);
    }
}
