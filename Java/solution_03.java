    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s="";
            if(n%2==1)
                {
                System.out.println("Weird");
            }
            else{
                if(n>=2 && n<=5){
                    System.out.println("Not Weird");
                }
                if(n>=6 && n<=20){
                    System.out.println("Weird");
                }
                if(n>20){
                    System.out.println("Not Weird");
                }
            }
        }
    }