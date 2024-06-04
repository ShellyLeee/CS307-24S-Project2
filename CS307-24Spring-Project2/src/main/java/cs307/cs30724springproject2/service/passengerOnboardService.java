package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.passengerOnboard;
import cs307.cs30724springproject2.mapper.passengerOnboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class passengerOnboardService {
    @Autowired
    public passengerOnboardMapper passengerOnboardMapper;

    public List<passengerOnboard> getAllPassengerOnboard(){
        return passengerOnboardMapper.selectAllPassengerOnboard();
    }

    public void deletePassengerOnboardById(int id){
        passengerOnboardMapper.deleteByPrimaryKey(id);
    }

    public void deletePassengerOnboardByInfo(String passengerId, String station){
        passengerOnboardMapper.deleteByIdStation(passengerId, station);
    }

    public void insertPassengerOnboard(passengerOnboard passengerOnboard){
        passengerOnboardMapper.insert(passengerOnboard);
    }

}
