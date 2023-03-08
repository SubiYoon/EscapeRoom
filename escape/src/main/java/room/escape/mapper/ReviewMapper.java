package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.dto.Review;
import room.escape.frame.MapperFrame;

@Mapper
@Repository
public interface ReviewMapper extends MapperFrame<Integer, Review> {
    
}
