package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.cardOnboard;
import cs307.cs30724springproject2.mapper.cardOnboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cardOnboardService {
    @Autowired
    public cardOnboardMapper cardOnboardMapper;

    public List<cardOnboard> getAllCardOnboard(){
        return cardOnboardMapper.selectAllCardOnboard();
    }

    public void deleteCardOnboardById(int id){
        cardOnboardMapper.deleteByPrimaryKey(id);
    }

    public void deleteCardOnboardByInfo(String cardCode, String station){
        cardOnboardMapper.deleteByCodeStation(cardCode, station);
    }

    public void insertCardOnboard(cardOnboard cardOnboard){
        cardOnboardMapper.insert(cardOnboard);
    }
}
