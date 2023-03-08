package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.dto.Wanted;
import room.escape.frame.MapperFrame;

@Mapper
@Repository
public interface WantedMapper extends MapperFrame<Integer, Wanted> {
    
}
