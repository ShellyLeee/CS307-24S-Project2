package cs307.cs30724springproject2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cs307.cs30724springproject2.service.lineDetailService;

import java.util.ArrayList;
import java.util.HashMap;
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
        System.out.println(n + " " + lineName + " " + stationName);
        lineDetailService.updateInsertStationNoBehind(n, lineName, stationName);
    }

    @PostMapping("/insertMultipleStationsBehind")
    public ResponseEntity<String> insertMultipleStationsBehind(@RequestBody Map<String, Object> request) {
        try {
            String lineName = (String) request.get("lineName");
            String stationName = (String) request.get("stationName");
            List<String> stationValues = (List<String>) request.get("stations");

            // 将站点名称转换为Map格式的列表
            List<Map<String, Object>> stations = new ArrayList<>();
            for (String stationName1 : stationValues) {
                Map<String, Object> stationMap = new HashMap<>();
                stationMap.put("name", stationName1);
                stations.add(stationMap);
            }

            lineDetailService.insertMultipleStationsBehind(lineName, stationName, stations);
            return ResponseEntity.ok("Stations inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inserting stations: " + e.getMessage());
        }
    }

    @PostMapping("/updateInsertStationNoFront")
    public void updateInsertStationNoFront(@RequestBody Map<String, Object> parameters) {
        String strN = (String) parameters.get("n");
        int n = Integer.parseInt(strN);
        String lineName = (String) parameters.get("lineName");
        String stationName = (String) parameters.get("stationName");
        lineDetailService.updateInsertStationNoFront(n, lineName, stationName);
    }

    @PostMapping("/insertMultipleStationsFront")
    public ResponseEntity<String> insertMultipleStationsFront(@RequestBody Map<String, Object> request) {
        try {
            String lineName = (String) request.get("lineName");
            String stationName = (String) request.get("stationName");
            String strN = (String) request.get("n");
            int n = Integer.parseInt(strN);
            List<String> stationValues = (List<String>) request.get("stations");

            // 将站点名称转换为Map格式的列表
            List<Map<String, Object>> stations = new ArrayList<>();
            for (String stationName1 : stationValues) {
                Map<String, Object> stationMap = new HashMap<>();
                stationMap.put("name", stationName1);
                stations.add(stationMap);
            }

            lineDetailService.insertMultipleStationsFront(lineName,n, stationName, stations);
            return ResponseEntity.ok("Stations inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inserting stations: " + e.getMessage());
        }
    }

    @PostMapping("/updateStationFromLine")
    public ResponseEntity<String> updateStationFromLine(@RequestBody Map<String, String> request) {
        try {
            String lineName = request.get("lineName");
            String stationName = request.get("stationName");
            lineDetailService.updateStationFromLine(lineName, stationName);
            return ResponseEntity.ok("Station deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting station: " + e.getMessage());
        }
    }

    @PostMapping("/deleteStationFromLine")
    public ResponseEntity<String> deleteStationFromLine(@RequestBody Map<String, String> request) {
        try {
            String lineName = request.get("lineName");
            String stationName = request.get("stationName");
            lineDetailService.deleteStationFromLine(lineName, stationName);
            return ResponseEntity.ok("Station deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting station: " + e.getMessage());
        }
    }

    @GetMapping("/getNBefore")
    public List<String> getStationsBefore(@RequestParam String lineName,
                                    @RequestParam String stationName,
                                    @RequestParam int number) {
        Map<String, Object> params = new HashMap<>();
        params.put("lineName", lineName);
        params.put("stationName", stationName);
        params.put("number", number);
        return lineDetailService.getNBefore(params);
    }
    @GetMapping("/getNAfter")
    public List<String> getStationsAfter(@RequestParam String lineName,
                                    @RequestParam String stationName,
                                    @RequestParam int number) {
        Map<String, Object> params = new HashMap<>();
        params.put("lineName", lineName);
        params.put("stationName", stationName);
        params.put("number", number);
        return lineDetailService.getNAfter(params);
    }
}
