package cs307.cs30724springproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cs307.cs30724springproject2.mapper.lineDetailMapper;

import java.util.List;
import java.util.Map;

@Service
public class lineDetailService {
    @Autowired
    private lineDetailMapper lineDetailMapper;

    public void updateInsertStationNoBehind(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoBehind(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }

    public void insertMultipleStationsBehind(String lineName, String stationName, List<Map<String, Object>> stations) {
        int increment = 1;
        for (Map<String, Object> station : stations) {
            station.put("stationNoIncrement", increment);
            System.out.println(increment);
            increment++;
        }
        lineDetailMapper.insertMultipleStationsBehind(lineName, stationName, stations);
    }

    public void updateInsertStationNoFront(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoFront(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }

    public void insertMultipleStationsFront(String lineName, int n, String stationName, List<Map<String, Object>> stations) {
        int reduction = n;
        for (Map<String, Object> station : stations) {
            station.put("stationNoReduction", reduction);
            System.out.println(reduction);
            reduction--;
        }
        lineDetailMapper.insertMultipleStationsFront(lineName, stationName, stations);
    }
}
