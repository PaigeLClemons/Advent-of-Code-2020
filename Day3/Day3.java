package Day3;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day3{
    public static void main(String[] args){
        try{
            File inputFile = new File("Day3/test.txt");
            Scanner scanner = new Scanner(inputFile);
            String gamma = "";
            String epsilon = "";
            int gammaDigit = -1;
            int epsilonDigit = -1;
            ArrayList<String> binaryNums = new ArrayList<String>();
            int[] zeroCount = {0, 0, 0, 0, 0};
            int[] oneCount = {0, 0, 0, 0, 0};

            while(scanner.hasNextLine()){
                binaryNums.add(scanner.nextLine());
            }

            for(int i = 0; i < binaryNums.size(); i++){
                String tempBinary = binaryNums.get(i);
                for(int j = 0; j < tempBinary.length(); j++){
                    if(tempBinary.charAt(j) == '0'){
                        zeroCount[j]++;
                    }
                    else{
                        oneCount[j]++;
                    }
                }
            }

            for(int i = 0; i < 5; i++){
                if(zeroCount[i] > oneCount[i]){
                    gamma += "0";
                    epsilon += "1";
                }
                else{
                    gamma += "1";
                    epsilon += "0";
                }
            }

            System.out.println("Gamma = " + gamma);
            System.out.println("Epsilon = " + epsilon);
            
            
            scanner.close();

        }
        catch(FileNotFoundException e){
            System.out.println("There is no file you fool");
            e.printStackTrace();
        }
    }
}