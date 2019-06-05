package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_Restaurant_Constructor() {
        Restaurant classTest = new Restaurant("Geo's", "$$");
    }

    @Test
    public void test_Restaurant_toString(){
        Restaurant classTest = new Restaurant("Geo's", "$$");

        assertEquals("Should be: The restaurant Geo's has 0.0 and has a price range of $$",
                "The restaurant Geo's has 0.0 and has a price range of $$",
                classTest.toString());
    }

    @Test
    public void test_Restaurant_AddReview() {
        Restaurant classTest = new Restaurant("Geo's", "$$");
        Review testReview = new Review("jeff",
                "Some One likes this but not me", 2.0);

        classTest.addReview(testReview);

        assertEquals("Should return: 2.0 out of 5 stars \nSome One likes this but not me \nWritten by jeff",
                "2.0 out of 5 stars \nSome One likes this but not me \nWritten by jeff",
                testReview.toString());
    }

    @Test
    public void test_Restaurant_AddMultiple_Reviews_avg() {
        Restaurant classTest = new Restaurant("Geo's", "$$");
        Review testReview = new Review("jeff",
                "Some One likes this but not me", 2.0);
        Review testReview2 = new Review("steve",
                "Steve likes this but not me", 4.0);


        classTest.addReview(testReview);
        classTest.addReview(testReview2);

        assertEquals("Should return: The restaurant Geo's has 3.0 and has a price range of $$",
                "The restaurant Geo's has 3.0 and has a price range of $$",
                classTest.toString());
    }
}