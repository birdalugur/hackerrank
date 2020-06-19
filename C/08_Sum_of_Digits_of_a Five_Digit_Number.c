#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int lengthOfInt();
int sumDigit();

int sumDigit(int n){

    int length_n = lengthOfInt(n);
    int total = 0;

    if (n<=99999 & n>=10000){
        
        for(int i=0;i<length_n;i++){
            
            int value = (int) (n / pow(10,i)) % 10;
            total += value;
        }
    }

    else
    {
        exit(EXIT_FAILURE);
    }

    return total;
    
}

int lengthOfInt(int n){
    int count = 0;

    while (n != 0)
    {
        n /=10;
        count ++;
    }
    return count;    
}

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.

    int sum_n = sumDigit(n);

    printf("%d",sum_n);

    return 0;
}

