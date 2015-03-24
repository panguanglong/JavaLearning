package com.company.Nineday;

import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/3/23
 * @description:
 */
public class Conditions {
    public static void fractionSum(int n) {
        double a = 0, b = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                a = a + (double) 1 / i;
            } else {
                b = b + (double) 1 / i - 1;
            }
        }
        System.out.println(a - b);
    }

    public static void repHello(int n, String m) {
        for (int i = 0; i < n; i++) {
            if (n > 0) {
                System.out.println(m);
            } else {
                System.out.println();
            }
        }
    }

    public static void printFactors(int n) {
        System.out.print(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }

        }
        System.out.println();
    }

    public static void printLetters(String m) {
        if (m == null || m.isEmpty()) {
            return;
        }

        for (int i = 0; i < m.length(); i++) {
            System.out.print(m.charAt(i));
            if (i < m.length() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printPow(int n, int m) {
        double i = Math.pow(n, m);
        System.out.println((int) i);
    }

    public static void printMamAadMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?");
        int array = scanner.nextInt();
        int max = 0;
        int temp = 0;
        for (int i = 0; i < array; i++) {
            System.out.print("Number" + (i + 1) + "：");
            int x = scanner.nextInt();
            }

        }


    public static void printMaxAndMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?");
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int num = scanner.nextInt();
        if (num == 0) {
            return;
        }

        for (int i = 0; i <  num; i++) {
            System.out.print("Number" + (i + 1) + "：");
            int value = scanner.nextInt() ;

            if (i == 0) {
                max = value;
                min = value;
            } else {
                if (max < value) {
                    max = value;
                }

                if (min > value) {
                    min = value;
                }
            }
        }

        System.out.println("largest num:" + max);
        System.out.println("smallest num:" + min);
    }

    public static void isStringNull() {
        String string = "";

        if (string.isEmpty()) {
            System.out.println("it's null");
        } else {
            System.out.println("it's not null");
        }
    }
}

