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
        System.out.println(id);
        // 根据 id 查询站点信息，并将信息存入 model 中
        station stationT = stationService.findStationById(id);
        model.addAttribute("station", stationT);
        return "stationInfo"; // 返回站点信息的HTML页面
    }

    @ResponseBody //这是@Controller所限制下，stationT必须要解析为json文件所需要的注释
    @GetMapping(value = "/selectByChineseName", produces = "application/json;charset=utf-8")
    public station selectByChineseName(@RequestParam String chineseName) {
        System.out.println(chineseName);
        station stationT = stationService.findStationByChineseName(chineseName);
        System.out.println(stationT.getEnglishName());
        return stationT;
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

    @PostMapping("/updateStation")
    public ResponseEntity<String> updateStation(@RequestBody station stationT) {
        System.out.println(stationT.getChineseName());
        try {
            stationService.updateStation(stationT); // 调用服务层方法执行更新操作
            return new ResponseEntity<>("Station updated successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to update station.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
