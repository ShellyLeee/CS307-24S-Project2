package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.card;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cardMapper {

    int deleteByPrimaryKey(String code);

    int insert(card row);

    int insertSelective(card row);

    card selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(card row);

    int updateByPrimaryKey(card row);

    List<card> selectAll();
}