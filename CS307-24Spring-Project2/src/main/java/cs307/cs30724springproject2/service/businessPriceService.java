package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.businessPrice;
import cs307.cs30724springproject2.mapper.businessPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class businessPriceService {
    @Autowired
    public businessPriceMapper businessPriceMapper;

    // 这里要改
    public businessPrice getprice(String start, String end) {
        return businessPriceMapper.selectByStations(start, end);
    }
}
