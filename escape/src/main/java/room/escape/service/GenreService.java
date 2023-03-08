package room.escape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import room.escape.dto.Genre;
import room.escape.frame.ServiceFrame;
import room.escape.mapper.GenreMapper;

@Service
public class GenreService implements ServiceFrame<Integer, Genre>{
    @Autowired
    GenreMapper mapper;

    @Override
    public void register(Genre v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Genre v) throws Exception {
        mapper.update(v);
    }

    @Override
    public Genre get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Genre> get() throws Exception {
        return mapper.selectAll();
    }
}
