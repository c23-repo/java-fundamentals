import java.util.*;

public class ArraysLoops {
//received help from Tim
    public int [] roll(int rolled){
        int[] diceOutput = new int[rolled];

        for (int i = 0; i < diceOutput.length; i++){
            int diceRoll = (int) Math.ceil(6 * Math.random());
            diceOutput[i] = diceRoll;
        }
        return diceOutput;
    }
//received help from Chai
    public boolean containsDuplicates(int []inputArr){
        Arrays.sort(inputArr);
        System.out.println(inputArr);
        for (int i = 1; i < inputArr.length; i++){
            if(inputArr[i-1] == inputArr[i]){
                return true;
            }
        }
        return false;
    }

    public int calculatingAverages()
}
