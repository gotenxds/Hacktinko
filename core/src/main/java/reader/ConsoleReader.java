package reader;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader implements Reader
{
    private final BufferedReader bufferedReader;

    ConsoleReader(BufferedReader bufferedReader)
    {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public Object read()
    {
        try
        {
            return bufferedReader.readLine();
        }
        catch (IOException e)
        {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public Object get()
    {
        return read();
    }
}
