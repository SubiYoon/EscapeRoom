package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Notice;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.NoticeMapper;

@Service
public class NoticeService implements ServiceFrame<Integer, Notice>{
    @Autowired
    NoticeMapper mapper;

    @Override
    public void register(Notice v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Notice v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Notice get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Notice> get() throws Exception {
        return mapper.selectAll();
    }
}
