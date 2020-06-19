import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList array = new ArrayList();
        for (int i = 0; i<n; i++){
            array.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        for (int i = 0; i< q ; i++){
            String chooice = scanner.next();
            if (chooice.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                array.add(x,y);
            }
            if (chooice.equals("Delete")){
                int x = scanner.nextInt();
                array.remove(x);
            }
        }
        for (int i = 0; i<array.size(); i++){
            System.out.printf("%d ", array.get(i));
        }

    }
}
