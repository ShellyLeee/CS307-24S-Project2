package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.cardOnboard;
import cs307.cs30724springproject2.service.cardOnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardOnboard")
public class cardOnboardController {
    @Autowired
    private cardOnboardService cardOnboardService;

    @GetMapping(value = "/selectAllCardOnboard",
            produces = "application/json;charset=utf-8")
    public List<cardOnboard> getAllCardOnboard() {
        return cardOnboardService.getAllCardOnboard();
    }

    @PostMapping("/insert")
    public ResponseEntity<String> addCardInfo
            (@RequestBody cardOnboard cardOnboard) {
        try {
            cardOnboardService.insertCardOnboard(cardOnboard);
            return ResponseEntity.ok("Passenger with card boarded successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to board.");
        }
    }

    @PostMapping("/deleteByCodeStation")
    public ResponseEntity<String> deleteCardOnboard(@RequestParam("String") String code, String station) {
        try {
            cardOnboardService.deleteCardOnboardByInfo(code, station);
            return ResponseEntity.ok("Passenger with card exited successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to exit.");
        }
    }
}