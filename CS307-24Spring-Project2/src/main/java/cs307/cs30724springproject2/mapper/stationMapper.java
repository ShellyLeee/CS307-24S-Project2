package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface stationMapper {
    //删
    void deleteById(int id);

    //增
    void insert(station row);

    //查
    station selectById(int id);
    station selectByChineseName(String chineseName);

    //改
    void updateByChineseName(station row);


}