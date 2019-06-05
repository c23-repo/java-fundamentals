package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {


    @Test
    public void test_Review_Constructor() {
        Review classTest = new Review("Steve", "terrible restaurant", 1);
    }

    @Test
    public void test_Review() {
        Review classTest = new Review("Steve",
                "terrible restaurant and I would never go there again", 1);

        assertEquals("Should be: 1 out of 5 stars \nterrible restaurant and I would never go there again \nWritten by Steve",
                "1.0 out of 5 stars \nterrible restaurant and I would never go there again \nWritten by Steve",
                classTest.toString());
    }


}