package cs307.cs30724springproject2.controller;
import cs307.cs30724springproject2.entity.line;
import cs307.cs30724springproject2.service.lineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller //相比RestController：返回一个html界面
@RequestMapping("/line")
public class lineController {
    @Autowired
    private lineService lineService;

    @GetMapping(value = "/selectByNameInfo",produces = "application/json;charset=utf-8")
    public String selectByNameInfo(@RequestParam("name") String name, Model model) {
        line lineT = lineService.findLineByName(name);
        model.addAttribute("line", lineT);
        return "lineInfo"; // 返回线路信息的HTML页面
    }

    @ResponseBody
    @GetMapping(value = "/selectByName", produces = "application/json;charset=utf-8")
    public line selectByName(@RequestParam String name) {
        line lineT = lineService.findLineByName(name);
        return lineT;
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertLine(@RequestBody line lineT) {
        try {
            lineService.insertLine(lineT);
            return ResponseEntity.ok("line inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert line.");
        }
    }

    @PostMapping("/delete")
    public ResponseEntity<String> deleteLine(@RequestParam("name") String name) {
        try {
            lineService.deleteLineByName(name);
            return ResponseEntity.ok("line deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete line.");
        }
    }

    @PostMapping("/updateLine")
    public ResponseEntity<String> updateLine(@RequestBody line lineT) {
        try {
            lineService.updateLine(lineT);
            return new ResponseEntity<>("Line updated successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to update line.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
