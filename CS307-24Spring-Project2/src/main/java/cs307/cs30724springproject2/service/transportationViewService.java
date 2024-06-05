package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.transportationView;
import cs307.cs30724springproject2.mapper.transportationViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class transportationViewService {

    @Autowired
    public transportationViewMapper transportationViewMapper;

    public transportationView findTransInfo(String stationName, String exit) {
        return transportationViewMapper.selectTransInfo(stationName, exit);
    }

}
