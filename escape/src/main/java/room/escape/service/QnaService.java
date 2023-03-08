package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Qna;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.QnaMapper;

@Service
public class QnaService implements ServiceFrame<Integer, Qna>{
    @Autowired
    QnaMapper mapper;

    @Override
    public void register(Qna v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Qna v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Qna get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Qna> get() throws Exception {
        return mapper.selectAll();
    }
}
