package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.station;
import cs307.cs30724springproject2.mapper.stationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stationService {
    @Autowired
    public stationMapper StationMapper;

    public station findStationById(int id) {
        return StationMapper.selectById(id);
    }

    public station findStationByChineseName(String chineseName) {
        return StationMapper.selectByChineseName(chineseName);
    }

    public void insertStation(station station) {
        StationMapper.insert(station);
    }
    public void deleteStationById(int id) {
        StationMapper.deleteById(id);
    }
    public void updateStation(station station) {
        StationMapper.updateByChineseName(station);
    }
}
