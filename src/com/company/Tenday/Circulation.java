package com.company.Tenday;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/3/24
 * @description:
 */
public class Circulation {
    public static void printName() {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a person name:");
        String name = scanner.next();
        names.add(name);
        int i = 0;
        for (int k = 0; k < 10; k++) {
            while (true) {
                i++;
                System.out.print("Type a person name:");
                name = scanner.next();
                if (name.equals("empty")) {
                    break;
                }
                names.add(name);
            }
        }
        for (String item : names) {
            System.out.print(item + "\t");
        }
    }


    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number:");
        int input = scanner.nextInt();

        int sum = 0;
        int times = 0;

        while (input > 0) {
            times++;
            sum += input;

            System.out.print("Type a number:");
            input = scanner.nextInt();

            if (input < 0) {
                System.out.println(input);
                System.out.println("Average was" + (double) sum / times);
                return;
            }
        }
    }

    public static void printX() {
        Random r = new Random();
        int i = r.nextInt(18) + 5;
        int j = 0;
        while (j < i) {
            j++;
            System.out.print("X");
        }

        System.out.println();
    }

    public static void printXTow() {
        Random r = new Random();
        int i = r.nextInt(9) + 2;
        int j = 0;
        while (j < i) {
            j++;
            printX();
        }
    }

    public static void printString() {
        Random r = new Random();
        int i = r.nextInt(10) + 5;
        int j = 0;
        while (j < i) {
            j++;
            printStringTow();
        }
    }

    public static void printStringTow() {
        String random = "abcdefghijklnmopqrstuvwxyz";
        Random r = new Random();
        int i = r.nextInt(80) + 1;
        int k = 0;
        while (k < i) {
            k++;
            System.out.print(random.charAt(r.nextInt(23) + 0));
        }
        System.out.println();
    }
}
