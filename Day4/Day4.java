package Day4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day4{
    public static void main(String[] args){
        try{
            File inputFile = new File("Day4/input.txt");
            Scanner scanner = new Scanner(inputFile);
            
            scanner.close();

        }
        catch(FileNotFoundException e){
            System.out.println("There is no file you fool");
            e.printStackTrace();
        }
    }
}
