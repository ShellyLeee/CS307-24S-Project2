package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.cardRide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface cardRideMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(cardRide row);

    int insertSelective(cardRide row);

    cardRide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cardRide row);

    int updateByPrimaryKey(cardRide row);

    List<cardRide> selectCardRideByParameters(
            @Param("cardCode") String cardCode,
            @Param("startStation") String startStation,
            @Param("endStation") String endStation,
            @Param("price") Integer price,
            @Param("startTime") LocalDateTime startTime,
            @Param("endTime") LocalDateTime endTime
    );
}