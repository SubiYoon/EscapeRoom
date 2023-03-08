package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Comment;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.CommentMapper;
@Service
public class CommentService implements ServiceFrame<Integer, Comment>{
    @Autowired
    CommentMapper mapper;

    @Override
    public void register(Comment v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Comment v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Comment get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Comment> get() throws Exception {
        return mapper.selectAll();
    }
}
