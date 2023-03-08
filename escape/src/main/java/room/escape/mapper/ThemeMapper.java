package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.frame.MapperFrame;
import room.escape.dto.Theme;

@Mapper
@Repository
public interface ThemeMapper extends MapperFrame<Integer, Theme> {
    
}
