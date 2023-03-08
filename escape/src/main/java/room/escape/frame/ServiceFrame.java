package room.escape.frame;

import java.util.List;

public interface ServiceFrame<K, V> {
    public List<V> get() throws Exception;
}
