package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Theme;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.ThemeMapper;

@Service
public class ThemeService implements ServiceFrame<Integer, Theme>{
    @Autowired
    ThemeMapper mapper;

    @Override
    public void register(Theme v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Theme v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Theme get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Theme> get() throws Exception {
        return mapper.selectAll();
    }
}
