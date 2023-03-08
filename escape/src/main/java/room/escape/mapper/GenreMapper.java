package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.frame.MapperFrame;
import room.escape.dto.Genre;

@Mapper
@Repository
public interface GenreMapper extends MapperFrame<Integer, Genre> {
    
}
