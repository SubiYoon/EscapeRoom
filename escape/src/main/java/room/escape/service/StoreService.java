package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Store;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.StoreMapper;

@Service
public class StoreService implements ServiceFrame<Integer, Store>{
    @Autowired
    StoreMapper mapper;

    @Override
    public void register(Store v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Store v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Store get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Store> get() throws Exception {
        return mapper.selectAll();
    }
}
