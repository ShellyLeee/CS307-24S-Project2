package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.card;
import cs307.cs30724springproject2.mapper.cardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//加到容器里
@Service
public class cardService {

    //依赖注入
    @Autowired
    public cardMapper CardMapper;

    public List<card> selectAll(){
        return CardMapper.selectAll();
    };

    //写逻辑的类
}
