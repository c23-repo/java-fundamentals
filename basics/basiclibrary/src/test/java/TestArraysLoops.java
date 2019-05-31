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

    @Test public void testCalculatingAverages(){
        ArraysLoops classForTesting = new ArraysLoops();
        int []inputArr = new int[]{1, 2, 3, 4, 5};
        double expectedOutput = 3.0;

        assertEquals("This should return the average of the array.", expectedOutput,
                classForTesting.calculatingAverages(inputArr), 0);
    }

    @Test public void testAverageOfAverage(){
        ArraysLoops classForTesting = new ArraysLoops();

        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {4, 8, 12, 16, 20}
        };
        double expectedOutput = 3.0;
        assertEquals("this should print out an avg of 3 for each index in the array",
                expectedOutput, classForTesting.averageOfAverages(arr), 0);
    }

}
