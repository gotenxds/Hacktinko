package reader;

import com.google.common.base.Supplier;

public interface Reader<T> extends Supplier<T>
{
    T read();
}
