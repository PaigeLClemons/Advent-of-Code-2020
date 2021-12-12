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
            ArrayList<String> binaryNums = new ArrayList<String>();
            ArrayList<String> binaryNums2 = new ArrayList<String>();
            // int[] zeroCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            // int[] oneCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] zeroCount = {0, 0, 0, 0, 0};
            int[] oneCount = {0, 0, 0, 0, 0};

            while(scanner.hasNextLine()){
                String temp = scanner.nextLine();
                binaryNums.add(temp);
                binaryNums2.add(temp);
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

            System.out.println("Power Consumption = " + (Integer.parseInt(epsilon, 2) * Integer.parseInt(gamma, 2)));


            //Gammma helps find Oxygen
            //Epsilon helps find CO2

            for(int j = 0; j < gamma.length(); j++){
                for(int i = 0; i < binaryNums.size(); i++){
                    if(binaryNums.size() > 1){
                        if(binaryNums.get(i).charAt(j) != gamma.charAt(j)){
                            binaryNums.remove(i);
                            i--;
                        }
                    }
                }
            }

            for(int j = 0; j < epsilon.length(); j++){
                for(int i = 0; i < binaryNums2.size(); i++){
                    if(binaryNums2.size() > 1){
                        if(binaryNums2.get(i).charAt(j) != epsilon.charAt(j)){
                            binaryNums2.remove(i);
                            i--;
                        }
                    }
                }
            }

            System.out.println(binaryNums.size());
            System.out.println(binaryNums.get(0));
           

            //System.out.println("Life Support Rating = " + (Integer.parseInt(binaryNums.get(0), 2) * Integer.parseInt(binaryNums2.get(0), 2)));

            
            scanner.close();

        }
        catch(FileNotFoundException e){
            System.out.println("There is no file you fool");
            e.printStackTrace();
        }
    }
}