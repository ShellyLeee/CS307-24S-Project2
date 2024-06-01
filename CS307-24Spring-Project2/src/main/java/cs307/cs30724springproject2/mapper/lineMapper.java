package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.line;
import cs307.cs30724springproject2.entity.station;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Mapper
public interface lineMapper {

    line selectByName(String name);

    void deleteByName(String name);

    void insertLine(line row);

    void updateByName(line row);

}