package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.passengerRide;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface passengerRideMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(passengerRide row);

    int insertSelective(passengerRide row);

    passengerRide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(passengerRide row);

    int updateByPrimaryKey(passengerRide row);
}