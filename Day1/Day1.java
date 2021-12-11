package Day1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day1{
    public static void main(String[] args){
        try{
            File inputFile = new File("Day1/input.txt");
            Scanner scanner = new Scanner(inputFile);
            int previous = 0;
            int next = 0;
            int counter = 0;
            ArrayList<Integer> input = new ArrayList<Integer>();
            ArrayList<Integer> sum = new ArrayList<Integer>();
            
            while(scanner.hasNextBigInteger()){
                input.add(scanner.nextInt());
            }

            for(int i = 0; i < input.size() - 2; i++){
                sum.add(input.get(i) + input.get(i + 1) + input.get(i + 2));
            }

            previous = sum.get(0);

            for(int i = 1; i < sum.size(); i++){
                next = sum.get(i);
                if(next > previous){
                    counter++;
                }
                previous = next;
            }

            System.out.println("counter = " + counter);

            scanner.close();

        }
        catch(FileNotFoundException e){
            System.out.println("There is no file you fool");
            e.printStackTrace();
        }
    }
}