package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.mapper.cardRideMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cardRideService {

    @Autowired
    public cardRideMapper cardRideMapper;

    public void insert(cardRide cardRide) {cardRideMapper.insert(cardRide);}
}
