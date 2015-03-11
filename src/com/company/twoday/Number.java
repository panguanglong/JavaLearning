package com.company.twoday;

/**
 * @author Administrator
 * @time 2015/3/11
 * @description:
 */
public class Number {
    public static void sayNumber() {
        for (int i = 2; i < 100; i++) {
            int j;
            for (j = 2; j < i; j++)
                if (i % j == 0)
                    break;
            {
                if (i % j != i)
                    System.out.print(j + " ");
            }
        }
    }
}





