package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.service.cardRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/cardRide")
public class cardRideController {
    @Autowired
    cardRideService cardRideService;

    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody cardRide cardRide) {
        try {
            cardRideService.insert(cardRide);
            return ResponseEntity.ok("Card's ride inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert ride.");
        }
    }

    @GetMapping("/multiSelect")
    public List<cardRide> getCardRides(
            @RequestParam(required = false) String cardCode,
            @RequestParam(required = false) String startStation,
            @RequestParam(required = false) String endStation,
            @RequestParam(required = false) Integer price,
            @RequestParam(required = false) LocalDateTime startTime,
            @RequestParam(required = false) LocalDateTime endTime
    ) {
        List<cardRide> target = cardRideService.getCardRidesByParameters(cardCode, startStation, endStation, price, startTime, endTime);
        for (cardRide cardRide : target) {
            System.out.println(cardRide); // 假设CardRide类已经实现了toString()方法
        }
        return cardRideService.getCardRidesByParameters(cardCode, startStation, endStation, price, startTime, endTime);
    }
}

