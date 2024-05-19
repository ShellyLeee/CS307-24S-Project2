package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.station;
import cs307.cs30724springproject2.mapper.stationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stationService {
    @Autowired
    public stationMapper StationMapper;

    public station findStationById(int id) {
        return StationMapper.selectById(id);
    }
}
