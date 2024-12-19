package org.example;

public class CalculateFactorial {
    public static long calculateFactorial(int n){
        if (n<0){
            throw new IllegalArgumentException("число не должно быть отрицательным");
        }
        if (n==0 ||n==1){
            return 1;
        }
        long result=1;
        for (int i = 2; i <= n; i++){
           result *= i;
        }
        return result;
    }
}
