package basiclibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args){
        System.out.println(errorsFinder("src/main/resources/gates.js"));
    }

    public static int errorsFinder(String path) {
        int numberOfErrors = 0;
        String errorMsg = "";
        try{
            Scanner s = new Scanner(new File(path));
            int lineNumber = 0;
            while (s.hasNextLine()){
                lineNumber++;
                String line = s.nextLine();

                if(line.endsWith("}") || line.endsWith("{") || line.contains("if") || line.contains("else") || line.length() < 1){
                    continue;
                } else if(!line.endsWith(";")) {
                    numberOfErrors++;
                    errorMsg += String.format("Line %d: missing semi-colon.\n", lineNumber);
                }

            }
        }catch(FileNotFoundException e){
            numberOfErrors = -1;
            System.out.println("File was not found");
            System.out.println(e);
        }
        System.out.println(numberOfErrors);
        return numberOfErrors;
    }
}
