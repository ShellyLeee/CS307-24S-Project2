package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.passengerOnboard;
import cs307.cs30724springproject2.service.passengerOnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/passengerOnboard")
public class passengerOnboardController {
    @Autowired
    private passengerOnboardService passengerService;

    @GetMapping("/selectAllPassengerOnboard")
    public List<passengerOnboard> getAllPassengerOnboard() {
        for (passengerOnboard item: passengerService.getAllPassengerOnboard()){
            System.out.println(item.getId());
            System.out.println(item.getPassengerId());
            System.out.println(item.getStartStation());
            System.out.println(item.getStartTime());
            System.out.println(item.getType());
        }
        return passengerService.getAllPassengerOnboard();
    }

    @PostMapping("/insert")
    public ResponseEntity<String> addPassengerInfo
            (@RequestBody passengerOnboard passengerOnboard) {
        try {
            passengerService.insertPassengerOnboard(passengerOnboard);
            return ResponseEntity.ok("Passenger boarded successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to board.");
        }
    }

    @PostMapping("/deleteByIdStation")
    public ResponseEntity<String> deletePassenger(@RequestParam("String") String id, String station) {
        try {
            passengerService.deletePassengerOnboardByInfo(id, station);
            return ResponseEntity.ok("Passengerexited successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("Failed to exit.");
        }
    }
}
