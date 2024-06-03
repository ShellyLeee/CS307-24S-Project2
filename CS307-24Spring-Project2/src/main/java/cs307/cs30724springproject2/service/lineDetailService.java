package cs307.cs30724springproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cs307.cs30724springproject2.mapper.lineDetailMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class lineDetailService {
    @Autowired
    private lineDetailMapper lineDetailMapper;

    public void updateInsertStationNoBehind(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoBehind(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }
    public void insertMultipleStationsBehind(String lineName, List<Map<String, Object>> stations) {
        for (Map<String, Object> station : stations) {
            System.out.println("Station info: " + station);
        }
        lineDetailMapper.insertMultipleStationsBehind(lineName, stations);
    }
    public void updateInsertStationNoFront(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoFront(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }
}
