package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinterTest {

    @Test
    public void testFindErrors(){
        Linter classForTest = new Linter();
        assertEquals("function should return error message with line and error", 46,
                classForTest.errorsFinder("src/main/resources/gates.js"));
    }

    @Test
    public void testFindErrors_wrongFilePath(){
        Linter classUnderTest = new Linter();
        assertEquals("should return -1 for wrong path", -1, classUnderTest.errorsFinder("test"));
    }

}