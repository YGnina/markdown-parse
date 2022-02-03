import static org.junit.Assert.*;
import org.junit.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void parseTest1() throws IOException{
        List<String> lin = List.of("https://something.com","some-page.html");

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);

        assertEquals(lin,MarkdownParse.getLinks(contents));
    }

    @Test
    public void parseTest2() throws IOException{
        List<String> expected = List.of("https://something.com","some-page.html");

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);

        assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test
    public void parseTest3() throws IOException{
        List<String> contents2 = List.of();

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);

        assertEquals(contents2.size(),100);
    }



}