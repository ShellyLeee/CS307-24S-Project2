package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.transportationView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface transportationViewMapper {
    transportationView selectTransInfo(String stationName, String exit);
}
