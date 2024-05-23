package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.passengerOnboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface passengerOnboardMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByIdStation(String id, String station);

    int insert(passengerOnboard row);

    int insertSelective(passengerOnboard row);

    passengerOnboard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(passengerOnboard row);

    int updateByPrimaryKey(passengerOnboard row);

    List<passengerOnboard> selectAllPassengerOnboard();
}
