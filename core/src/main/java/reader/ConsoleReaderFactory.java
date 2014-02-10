package reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReaderFactory
{
    public ConsoleReader create()
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        return new ConsoleReader(bufferedReader);
    }
}
