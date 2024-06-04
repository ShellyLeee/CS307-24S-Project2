package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.cardRide;
import cs307.cs30724springproject2.entity.passengerRide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface passengerRideMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(passengerRide row);

    int insertSelective(passengerRide row);

    passengerRide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(passengerRide row);

    int updateByPrimaryKey(passengerRide row);

    List<passengerRide> selectPassengerRideByParameters(
            @Param("passengerId") String passengerId,
            @Param("startStation") String startStation,
            @Param("endStation") String endStation,
            @Param("price") Integer price,
            @Param("startTime") LocalDateTime startTime,
            @Param("endTime") LocalDateTime endTime
    );
}