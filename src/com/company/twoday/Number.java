package com.company.twoday;

/**
 * @author Administrator
 * @time 2015/3/11
 * @description:
 */
public class Number {
    public static void sayNumber() {
        boolean isPrimes;
        for (int i = 2; i < 100; i++) {
            isPrimes = false;
            if (i == 2) {
                System.out.print(i + " ");
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimes = false;
                    break;
                }
                isPrimes = true;
            }

            if (isPrimes) {
                System.out.print(i + " ");
            }
        }
    }
}





