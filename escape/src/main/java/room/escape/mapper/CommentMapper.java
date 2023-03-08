package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.frame.MapperFrame;
import room.escape.dto.Comment;

@Mapper
@Repository
public interface CommentMapper extends MapperFrame<Integer, Comment> {
    
}
