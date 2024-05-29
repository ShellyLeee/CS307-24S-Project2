package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.passengerRide;
import cs307.cs30724springproject2.entity.passengerOnboard;
import cs307.cs30724springproject2.entity.price;
import cs307.cs30724springproject2.mapper.priceMapper;
import cs307.cs30724springproject2.mapper.passengerRideMapper;
import cs307.cs30724springproject2.mapper.passengerOnboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class passengerRideService {

    @Autowired
    public passengerRideMapper passengerRideMapper;

    @Autowired
    public passengerOnboardMapper passengerOnboardMapper;

    @Autowired
    public priceMapper priceMapper;

    public void insert(passengerRide passengerRide) {
        passengerOnboard boardedPassenger = passengerOnboardMapper.selectByIdStation(
                passengerRide.getPassengerId(), passengerRide.getStartStation()
        );
        price price = priceMapper.selectByStations(
                passengerRide.getStartStation(), passengerRide.getEndStation()
        );
        passengerRide.setPrice(price.getPrice());
        passengerRide.setStartTime(boardedPassenger.getStartTime());
        passengerRideMapper.insert(passengerRide);
    }
}
