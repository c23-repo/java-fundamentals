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

    public String tally(ArrayList<String> arr) {
        HashMap<String, Integer> votes = new HashMap<>();
        String[] plants = new String[]{"Bush", "Shrub", "Hedge"};

        for (String plant : plants) {
            votes.put(plant, 0);
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == "Bush"){
                int votesSoFar = votes.get("Bush");
                votes.put("Bush", votesSoFar + 1);
            } else if(arr.get(i) == "Shrub"){
                int votesSoFar = votes.get("Shrub");
                votes.put("Shrub", votesSoFar + 1);
            } else if(arr.get(i) == "Hedge"){
                int votesSoFar = votes.get("Hedge");
                votes.put("Hedge", votesSoFar + 1);
            }
        }

        int maximum = 0;
        String winner = "";

        for (String plant : plants){
            int count = votes.get(plant);
            if (count > maximum){
                maximum = count;
                winner = plant;
            }
        }
        return winner;
    }
}
