package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.price;
import cs307.cs30724springproject2.mapper.priceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class priceService {
    @Autowired
    public priceMapper priceMapper;

    // 这里要改
    public price getprice(String start, String end) {
        return priceMapper.selectByStations(start, end);
    }
}
