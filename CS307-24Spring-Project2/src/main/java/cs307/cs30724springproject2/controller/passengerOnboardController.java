package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.passengerOnboard;
import cs307.cs30724springproject2.service.passengerOnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengerOnboard")
public class passengerOnboardController {
    @Autowired
    private passengerOnboardService passengerService;

    @GetMapping(value = "/selectAllPassengerOnboard", produces = "application/json;charset=utf-8")
    public List<passengerOnboard> getAllPassengerOnboard() {
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
    public ResponseEntity<String> deleteByIdStation(@RequestParam String passengerId,
                                                    @RequestParam String startStation) {
        try {
            passengerService.deletePassengerOnboardByInfo(passengerId, startStation);
            return ResponseEntity.ok("Passenger exited successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("Failed to exit.");
        }
    }

    @ResponseBody
    @GetMapping(value = "/selectByIdStation")
    public passengerOnboard selectByIdStation(@RequestParam String passengerId,
                                              @RequestParam String startStation){
        return passengerService.selectByIdStation(passengerId,startStation);
    }
}
