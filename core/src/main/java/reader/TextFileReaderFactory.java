package reader;

import com.google.common.base.Optional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReaderFactory
{
    private final static String defaultEncoding = "UTF-8";

    public TextFileReader createFrom(String fileName, Optional<String> encodingOptional)
    {
        return new TextFileReader(createScanner(fileName, encodingOptional), new StringBuilderFactory());
    }

    private Scanner createScanner(String fileName, Optional<String> encodingOptional)
    {
        String encoding = encodingOptional.or(defaultEncoding);

        try
        {
            return new Scanner(new FileInputStream(fileName), encoding);
        }
        catch (FileNotFoundException e)
        {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
