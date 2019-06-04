package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_Restaurant_Constructor() {
        Restaurant classTest = new Restaurant("Geo's", 4.5, "$$");
        assertEquals("The restaurant Geo's has 4.5 and has a price range of $$", classTest.getName());

    }

    @Test
    public void getDollarSign() {
    }

    @Test
    public void getNumStars() {
    }

    @Test
    public void getName() {
    }
}