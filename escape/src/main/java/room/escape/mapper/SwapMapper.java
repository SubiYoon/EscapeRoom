package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.frame.MapperFrame;
import room.escape.dto.Swap;

@Mapper
@Repository
public interface SwapMapper extends MapperFrame<Integer, Swap> {
    
}
