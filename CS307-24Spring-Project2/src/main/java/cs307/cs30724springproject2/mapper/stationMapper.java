package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.station;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stationMapper {
    //删
    int deleteById(int id);

    //增
    int insert(station row);

    //查
    station selectById(int id);

    //改


    int updateByPrimaryKeySelective(station row);

    int updateByPrimaryKey(station row);


}