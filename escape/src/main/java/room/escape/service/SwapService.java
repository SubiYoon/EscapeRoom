package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Swap;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.SwapMapper;

@Service
public class SwapService implements ServiceFrame<Integer, Swap>{
    @Autowired
    SwapMapper mapper;

    @Override
    public void register(Swap v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Swap v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Swap get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Swap> get() throws Exception {
        return mapper.selectAll();
    }
}
