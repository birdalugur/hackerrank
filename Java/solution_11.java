import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int lengt = A.length() + B.length();
        int lexicographically = A.compareTo(B);
        String lex;
        if (lexicographically>0){
            lex = "Yes";
        }
        else
            lex = "No";

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase()+ B.substring(1);

        System.out.println(lengt);
        System.out.println(lex);
        System.out.println(A + " " + B);
        
    }
}


