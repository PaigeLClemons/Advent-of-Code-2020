package Day2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day2{
    public static void main(String[] args){
        try{
            File inputFile = new File("Day2/input.txt");
            Scanner scanner = new Scanner(inputFile);
            String tempNum = "";
            int h = 0;
            int d = 0;
            int aim = 0;
            ArrayList<Character> directions = new ArrayList<Character>();
            ArrayList<Integer> units = new ArrayList<Integer>();

            while(scanner.hasNextLine()){
                String temp = scanner.nextLine();
                for(int i = 0; i < temp.length(); i++){
                    if(i == 0){
                        directions.add(temp.charAt(0));
                    }                
                    else if(temp.charAt(i) == ' '){
                        tempNum = temp.substring(i + 1);
                    }
                }
                units.add(Integer.parseInt(tempNum));
            }
            
            for(int i = 0; i < directions.size(); i++){
                char dir = directions.get(i);

                if(dir == 'f'){
                    h += units.get(i);
                    d += aim * units.get(i);
                }
                else if(dir == 'd'){
                    aim += units.get(i);
                }
                else if(dir == 'u'){
                    aim -= units.get(i);
                }
            }

            System.out.println("Final Answer = " + (h * d));

            scanner.close();

        }
        catch(FileNotFoundException e){
            System.out.println("There is no file you fool");
            e.printStackTrace();
        }



    }
}