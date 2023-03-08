package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.dto.Qna;
import room.escape.frame.MapperFrame;

@Mapper
@Repository
public interface QnaMapper extends MapperFrame<Integer, Qna> {
    
}
