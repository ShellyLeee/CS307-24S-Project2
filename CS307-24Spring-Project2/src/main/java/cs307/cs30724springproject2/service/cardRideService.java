package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.entity.price;
import cs307.cs30724springproject2.entity.cardOnboard;
import cs307.cs30724springproject2.mapper.cardRideMapper;
import cs307.cs30724springproject2.mapper.priceMapper;
import cs307.cs30724springproject2.mapper.cardOnboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cardRideService {

    @Autowired
    public cardRideMapper cardRideMapper;

    @Autowired
    public cardOnboardMapper cardOnboardMapper;

    @Autowired
    public priceMapper priceMapper;

    public void insert(cardRide cardRide) {
        cardOnboard boardedCard = cardOnboardMapper.selectByCodeStation(
                cardRide.getCardCode(), cardRide.getStartStation()
        );
        price price = priceMapper.selectByStations(
                cardRide.getStartStation(), cardRide.getEndStation()
        );
        cardRide.setPrice(price.getPrice());
        cardRide.setStartTime(boardedCard.getStartTime());
        cardRideMapper.insert(cardRide);
    }
}
