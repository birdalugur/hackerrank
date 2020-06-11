#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int isEven(int n){
    if (n%2 == 0){
        return 1;
    }
    else
    {
        return 0;
    }
    
}

char* get_representation(int n){

    char * name;

    if (n>9){
        if (isEven(n)){
            name = "even";
        }
        else
        {
            name = "odd";
        }
        

    }
    else
    {
        if (n == 1){
            name = "one";
        }
        else if (n==2)
        {
            name = "two";
        }
        else if(n == 3)
        {
            name = "three";
        }
        else if (n==4){
            name = "four";
        }
        else if (n==5){
            name = "five";
        }
        else if (n==6){
            name = "six";
        }
        else if (n==7){
            name = "seven";
        }
        else if (n==8){
            name = "eight";
        }
        else if (n==9){
            name = "nine";
        }
        else
        {
            exit(EXIT_SUCCESS);
        }
    }
    
    
    return name;

}


int main() 
{

    int a, b;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.

    

    for(int i = a; i <= b; i++) {
        char* res = get_representation(i);
        printf("%s\n",res);

    }

    return 0;
}

