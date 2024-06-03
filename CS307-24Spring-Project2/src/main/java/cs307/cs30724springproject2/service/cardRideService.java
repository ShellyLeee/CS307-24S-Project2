package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.entity.price;
import cs307.cs30724springproject2.entity.businessPrice;
import cs307.cs30724springproject2.entity.cardOnboard;
import cs307.cs30724springproject2.mapper.cardRideMapper;
import cs307.cs30724springproject2.mapper.priceMapper;
import cs307.cs30724springproject2.mapper.businessPriceMapper;
import cs307.cs30724springproject2.mapper.cardOnboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class cardRideService {

    @Autowired
    public cardRideMapper cardRideMapper;

    @Autowired
    public cardOnboardMapper cardOnboardMapper;

    @Autowired
    public priceMapper priceMapper;

    @Autowired
    public businessPriceMapper businessPriceMapper;

    public void insert(cardRide cardRide) {
        cardOnboard boardedCard = cardOnboardMapper.selectByCodeStation(
                cardRide.getCardCode(), cardRide.getStartStation()
        );
        price price = priceMapper.selectByStations(
                cardRide.getStartStation(), cardRide.getEndStation()
        );
        businessPrice businessPrice = businessPriceMapper.selectByStations(
                cardRide.getStartStation(), cardRide.getEndStation()
        );
        if (boardedCard.getType().equals("普通")) {
            cardRide.setPrice(price.getPrice());
        } else if (boardedCard.getType().equals("商务")) {
            cardRide.setPrice(businessPrice.getPrice());
        } else cardRide.setPrice(price.getPrice());

        cardRide.setStartTime(boardedCard.getStartTime());
        cardRideMapper.insert(cardRide);
    }

    public List<cardRide> getCardRidesByParameters(String cardCode, String startStation, String endStation, Integer price, LocalDateTime startTime, LocalDateTime endTime) {
        return cardRideMapper.selectCardRideByParameters(cardCode, startStation, endStation, price, startTime, endTime);
    }


}
