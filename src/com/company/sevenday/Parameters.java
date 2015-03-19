package com.company.sevenday;

/**
 * @author Administrator
 * @time 2015/3/19
 * @description:
 */
public class Parameters {
    public static void printNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(" [" + i + "] ");
        }
        System.out.println();
    }

    public static void printPowersOf2(int num) {
        for (int i = 0; i <= num; i++) {
            double j = Math.pow(2, i);
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printPowersOfN(int b, int e) {
        for (int i = 0; i <= e; i++) {
            System.out.print(Math.pow(b, i) + " ");
        }
        System.out.println();
    }

    public static int largerAbsVal(int i, int j) {
        int k = Math.max(Math.abs(i), Math.abs(j));
        return k;
    }

    public static int largerAbsVal2(int i, int j, int x) {
        int k = Math.max(Math.abs(i), Math.abs(j));
        int y = Math.max(Math.abs(x), k);
        return y;
    }

    public static void quadratic(double a, double b, double c) {
        double x1 = -b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = -b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("x1=" + x1 + "   x2=" + x2);
    }

    public static void padString(String i, int j) {
        int k = j - i.length();
        for (int x = 0; x < k; x++) {
            System.out.print("#");
        }
        System.out.println(i);
    }

    public static void vertical(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }
    }

    public static void printReverse(String reverseString) {
        //对输入为空的判断
        if (null == reverseString) {
            return;
        }
        for (int i = reverseString.length() - 1; i >= 0; i--) {
            System.out.print(reverseString.charAt(i));
        }
        //String转为char数组
        char[] chars = reverseString.toCharArray();

        //打印输出
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

