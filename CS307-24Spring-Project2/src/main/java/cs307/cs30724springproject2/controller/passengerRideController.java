package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.entity.passengerRide;
import cs307.cs30724springproject2.service.passengerRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/passengerRide")
public class passengerRideController {
    @Autowired
    passengerRideService passengerRideService;

    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody passengerRide passengerRide) {
        try {
            passengerRideService.insert(passengerRide);
            return ResponseEntity.ok("Passenger's ride inserted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert ride.");
        }
    }

    @GetMapping( "/multiSelect")
    public List<passengerRide> getPassengerRides(
            @RequestParam(required = false) String passengerId,
            @RequestParam(required = false) String startStation,
            @RequestParam(required = false) String endStation,
            @RequestParam(required = false) Integer price,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startTime,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endTime
    ) {
        System.out.println(passengerId);
        List<passengerRide> target = passengerRideService.getPassengerRidesByParameters(passengerId, startStation, endStation, price, startTime, endTime);
        return target;
    }
}
