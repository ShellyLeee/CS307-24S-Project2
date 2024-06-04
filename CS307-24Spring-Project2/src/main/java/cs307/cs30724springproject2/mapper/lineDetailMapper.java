package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.lineDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface lineDetailMapper {
    void updateInsertStationNoBehind(Map<String, Object> parameters);
    void updateInsertStationNoFront(Map<String, Object> parameters);
    void insertMultipleStationsBehind(@Param("lineName") String lineName, @Param("stationName") String stationName, @Param("stations") List<Map<String, Object>> stations);
    void insertMultipleStationsFront(@Param("lineName") String lineName, @Param("stationName") String stationName, @Param("stations") List<Map<String, Object>> stations);
}