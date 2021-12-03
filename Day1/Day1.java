package Day1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1{
    public static void main(String[] args){
        try{
            File inputFile = new File("Day1/input.txt");
            Scanner scanner = new Scanner(inputFile);
            int previous = scanner.nextInt();
            int next = 0;
            int counter = 0;
            
            while(scanner.hasNextBigInteger()){
                next = scanner.nextInt();
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