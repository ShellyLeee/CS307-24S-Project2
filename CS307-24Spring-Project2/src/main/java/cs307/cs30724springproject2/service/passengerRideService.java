package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.passengerRide;
import cs307.cs30724springproject2.mapper.passengerRideMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class passengerRideService {

    @Autowired
    public passengerRideMapper passengerRideMapper;

    public void insert(passengerRide passengerRide) {passengerRideMapper.insert(passengerRide);}
}
