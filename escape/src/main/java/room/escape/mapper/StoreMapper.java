package room.escape.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import room.escape.dto.Store;
import room.escape.frame.MapperFrame;

@Mapper
@Repository
public interface StoreMapper extends MapperFrame<Integer, Store> {
    
}
