package cs307.cs30724springproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cs307.cs30724springproject2.mapper.lineDetailMapper;

import java.util.Map;

@Service
public class lineDetailService {
    @Autowired
    private lineDetailMapper lineDetailMapper;

    public void updateInsertStationNoBehind(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoBehind(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }
<<<<<<< Updated upstream

=======
    public void insertMultipleStationsBehind(String lineName, List<Map<String, Object>> stations) {
        int increment = 1;
        for (Map<String, Object> station : stations) {
            station.put("stationNoIncrement", increment);
            increment++;
        }
        lineDetailMapper.insertMultipleStationsBehind(lineName, stations);
    }
>>>>>>> Stashed changes
    public void updateInsertStationNoFront(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoFront(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }
}
