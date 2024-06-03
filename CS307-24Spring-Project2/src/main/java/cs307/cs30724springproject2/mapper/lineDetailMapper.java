package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.lineDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface lineDetailMapper {
    void updateInsertStationNoBehind(Map<String, Object> parameters);
    void updateInsertStationNoFront(Map<String, Object> parameters);
}