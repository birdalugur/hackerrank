import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList> num_seq = new ArrayList<ArrayList>();

        int valN = scanner.nextInt();

        for (int k = 0; k < valN; k++){
            int valD = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 0; i < valD; i++){
                numbers.add(scanner.nextInt());
            }            
            num_seq.add(numbers);
        }

        int valQ = scanner.nextInt();

        for (int i = 0; i < valQ; i++){
            int valX = scanner.nextInt()-1;
            int valY = scanner.nextInt()-1;
            if (valX < num_seq.size() && valY < num_seq.get(valX).size()){
                System.out.println(num_seq.get(valX).get(valY));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}
