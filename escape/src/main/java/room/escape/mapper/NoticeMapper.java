package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.dto.Notice;
import room.escape.frame.MapperFrame;

@Mapper
@Repository
public interface NoticeMapper extends MapperFrame<Integer, Notice> {
    
}
