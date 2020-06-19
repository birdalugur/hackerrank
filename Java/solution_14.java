import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static int Sum(int[] array){
        int _sum = 0;
        for (int i = 0; i < array.length; i++){
            _sum += array[i];
        }
        return _sum;
    }

    public static void main(String[] args) {

        int count = 0;
        int valN = scanner.nextInt();
        int[] seq = new int[valN];
        for (int i = 0; i < valN; i++){
            seq[i] = scanner.nextInt();
        }

        for (int i = 0; i < seq.length; i++){
            for (int t = valN; t > i; t--){
                int[] subArray = Arrays.copyOfRange(seq,i,t);
                if (Sum(subArray) < 0) count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
