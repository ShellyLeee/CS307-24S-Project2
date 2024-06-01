package cs307.cs30724springproject2.service;

import cs307.cs30724springproject2.entity.line;
import cs307.cs30724springproject2.mapper.lineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lineService {
    @Autowired
    public lineMapper LineMapper;

    public line findLineByName(String name) {
        return LineMapper.selectByName(name);
    }

    public void insertLine(line row) {
        LineMapper.insertLine(row);
    }
    public void deleteLineByName(String name) {
        LineMapper.deleteByName(name);
    }
    public void updateLine(line line) {
        LineMapper.updateByName(line);
    }
}
