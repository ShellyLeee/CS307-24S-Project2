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

    public void updateInsertStationNoFront(int n, String lineName, String stationName) {
        lineDetailMapper.updateInsertStationNoFront(Map.of("n", n, "lineName", lineName, "stationName", stationName));
    }
}
