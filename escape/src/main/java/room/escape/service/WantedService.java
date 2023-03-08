package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Wanted;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.WantedMapper;

@Service
public class WantedService implements ServiceFrame<Integer, Wanted>{
    @Autowired
    WantedMapper mapper;

    @Override
    public void register(Wanted v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Wanted v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Wanted get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Wanted> get() throws Exception {
        return mapper.selectAll();
    }
}
