package room.escape.frame;

import java.util.List;

public interface MapperFrame<K, V> {
    public List<V> selectAll() throws Exception;
}
