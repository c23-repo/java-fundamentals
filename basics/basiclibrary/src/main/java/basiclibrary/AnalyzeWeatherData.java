package basiclibrary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnalyzeWeatherData {

    public String analyzeWeatherData(int [][]weeklyTemps){

        int maxTemp = weeklyTemps [0][0];
        int minTemp = weeklyTemps [0][0];
        HashSet<Integer> set = new HashSet<>();
        String result = "";
        for (int i = 0; i < weeklyTemps.length; i++){
            for (int x = 0; x < weeklyTemps[i].length; x++) {
                set.add(weeklyTemps[i][x]);
                if (minTemp > weeklyTemps[i][x]) minTemp = weeklyTemps[i][x];
                if (maxTemp < weeklyTemps[i][x]) maxTemp = weeklyTemps[i][x];
            }
        }
        result = "High: " + maxTemp + "\nLow: " + minTemp;
        // We need a for loop from min -> max temp
        // index would temps
        // set.contains(index?) <-- if false concat "Never saw stuff" to result string
        for (int i = minTemp +1; i < maxTemp; i++){

            if (!set.contains(i)) result += "\nNever saw temperature: " + i;
        }
        System.out.println(result);
        return result;
    }
}
