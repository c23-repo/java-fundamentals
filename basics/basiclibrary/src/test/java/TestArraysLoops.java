import org.junit.Test;
import static org.junit.Assert.*;

public class TestArraysLoops {
    @Test public void testRoll(){
        ArraysLoops classForTesting = new ArraysLoops();
        int n = 4;

        assertTrue("Array will give a random values between 1 and 6 for the number of times rolled",
                classForTesting.roll(n).length == n);
    }

    @Test public void testDuplicatesExist(){
        ArraysLoops classForTesting = new ArraysLoops();
        int []inputArr = new int[]{1, 2, 3, 4, 3, 5, 6};

        assertTrue("Array should return true if duplicates", classForTesting.containsDuplicates(inputArr));
    }

    @Test public void testDuplicatesDoNotExist(){
        ArraysLoops classForTesting = new ArraysLoops();
        int []inputArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        assertFalse("Array should return false if no duplicates", classForTesting.containsDuplicates(inputArr));
    }

}
