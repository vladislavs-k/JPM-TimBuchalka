package com.timbuchalka.challenge._package;

public class Series {

    public static int nSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac *= i;
        }
        return fac;
    }

    static int fibonacci(int n) {

        int f[] = new int[n+2];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }


}
