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

    // received help from Will
    public double calculatingAverages(int []arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        return avg;
    }

    public double averageOfAverages(int [][]arr){
        double lowestAvg = 0;
        double []answer = new double[arr.length];

        for (int i = 0; i < arr.length; i++){
            if(i == 0){
                answer[i] = calculatingAverages(arr[i]);
                lowestAvg = answer[i];
            }else {
                answer[i] = calculatingAverages(arr[i]);
                if (lowestAvg > answer[i]) {
                    lowestAvg = answer[i];
                }
            }
        }
        return lowestAvg;
    }
}
