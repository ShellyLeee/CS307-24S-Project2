package cs307.cs30724springproject2.mapper;

import cs307.cs30724springproject2.entity.cardOnboard;
import cs307.cs30724springproject2.entity.passengerOnboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cardOnboardMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByCodeStation(String code, String station);

    int insert(cardOnboard row);

    int insertSelective(cardOnboard row);

    cardOnboard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cardOnboard row);

    int updateByPrimaryKey(cardOnboard row);

    List<cardOnboard> selectAllCardOnboard();
}
