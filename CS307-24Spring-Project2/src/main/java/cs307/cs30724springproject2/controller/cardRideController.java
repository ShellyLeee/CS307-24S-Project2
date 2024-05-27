package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.service.cardRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

}
