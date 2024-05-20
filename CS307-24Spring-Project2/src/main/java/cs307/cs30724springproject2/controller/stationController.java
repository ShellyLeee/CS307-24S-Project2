package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.station;
import cs307.cs30724springproject2.service.stationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

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

    @PostMapping("/insert")
    public ResponseEntity<String> insertStation(@RequestBody station stationT) {
        try {
            stationService.insertStation(stationT);
            return ResponseEntity.ok("Station inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert station.");
        }
    }
    @PostMapping("/delete")
    public ResponseEntity<String> deleteStation(@RequestParam("id") int id) {
        try {
            stationService.deleteStationById(id);
            return ResponseEntity.ok("Station deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete station.");
        }
    }

}
