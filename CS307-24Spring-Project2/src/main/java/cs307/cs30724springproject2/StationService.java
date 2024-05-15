package cs307.cs30724springproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station addStation(Station station) {
        // Add any additional business logic here
        return stationRepository.save(station);
    }

    public Station updateStation(Long id, Station station) {
        // Add any additional business logic here
        Station existingStation = stationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Station not found with id: " + id));
        existingStation.setName(station.getName());
        existingStation.setLatitude(station.getLatitude());
        existingStation.setLongitude(station.getLongitude());
        return stationRepository.save(existingStation);
    }

    public void deleteStation(Long id) {
        // Add any additional business logic here
        stationRepository.deleteById(id);
    }
}

