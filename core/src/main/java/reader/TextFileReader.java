package reader;

import java.util.Scanner;

public class TextFileReader implements Reader<String>
{
    private final Scanner scanner;
    private final StringBuilderFactory stringBuilderFactory;

    TextFileReader(Scanner scanner, StringBuilderFactory stringBuilderFactory)
    {
        this.scanner = scanner;
        this.stringBuilderFactory = stringBuilderFactory;
    }

    @Override
    public String read()
    {
        StringBuilder builder = stringBuilderFactory.create();

        while (scanner.hasNextLine())
        {
            builder.append(scanner.nextLine()).append('\n');
        }

        return builder.toString();
    }

    @Override
    public String get()
    {
        return read();
    }
}
