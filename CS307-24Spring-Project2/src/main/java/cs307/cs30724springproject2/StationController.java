package cs307.cs30724springproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @PostMapping("/add")
    public ResponseEntity<Station> addStation(@RequestBody Station station) {
        Station addedStation = stationService.addStation(station);
        return new ResponseEntity<>(addedStation, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Station> updateStation(@PathVariable("id") Long id, @RequestBody Station station) {
        Station updatedStation = stationService.updateStation(id, station);
        return new ResponseEntity<>(updatedStation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable("id") Long id) {
        stationService.deleteStation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
