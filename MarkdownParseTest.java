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

        assertEquals(contents2.size(),0);
    }

    @Test
    public void parseTest4() throws IOException{
        List<String> contents2 = List.of();

        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);

        assertEquals(contents2.size(),0);
    }

/** 
    @Test
    public void snippedTest1() throws IOException{
        List<String> expected_1 = List.of("`google.com","google.com","ucsd.edu");
        Path fileName = Path.of("Snippet-1.md");
        String contents = Files.readString(fileName);

        assertEquals(expected_1,MarkdownParse.getLinks(contents));
        
    }
    

    @Test
    public void snippedTest2() throws IOException{
        List<String> expected_2 = List.of("a.com", "a.com(())", "example.com");
        Path fileName = Path.of("Snippet-2.md");
        String contents = Files.readString(fileName);

        assertEquals(expected_2,MarkdownParse.getLinks(contents));
        
    }
    */

    @Test
    public void snippedTest3() throws IOException{
        List<String> expected_3 = List.of("https://ucsd-cse15l-w22.github.io/");
        Path fileName = Path.of("Snippet-3.md");
        String contents = Files.readString(fileName);

        assertEquals(expected_3,MarkdownParse.getLinks(contents));
        
    }

}