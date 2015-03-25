package com.company.Elevenday;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/3/25
 * @description:
 */
public class CirculationTwo {
    public static void makeGuesses() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int Time = 0;
        while (num < 48) {
            Time++;
            System.out.print("Guess = " + num);
            num = scanner.nextInt();
        }
        System.out.println("total: " + Time);
    }

    public static void playDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num: ");
        int num = scanner.nextInt();
        while (num < 13) {
            Random random = new Random();
            int Dice1 = random.nextInt(6) + 1;
            int Dice2 = random.nextInt(6) + 1;
            if (num != (Dice1 + Dice2)) {
                System.out.println(Dice1 + "and" + Dice2 + "=" + (Dice1 + Dice2));
            } else {
                System.out.println(Dice1 + "amd" + Dice2);
                break;
            }
        }
    }

    public static void showTwos(int num) {
        int time = 0;
        if (num % 2 == 0) {
            while (num % 2 == 0) {
                time++;
                num = num / 2;
                System.out.println(time + "*2  " + num);
            }
        } else {
            System.out.println(time + "*2  " + num);

        }
    }

    public static void printTurn() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("number: ");
        num = scanner.nextInt();
        System.out.println(num + "  in binary is  " + Integer.toBinaryString(num));
    }

    public static void numContinuous(int num1, int num2, int num3) {
        if (num1 == num2 + 1 && num1 == num3 + 2) {
            System.out.println(true);
        } else if (num1 == num2 + 2 && num1 == num3 + 1) {
            System.out.println(true);
        } else if (num1 + 1 == num2 && num3 + 2 == num2) {
            System.out.println(true);
        } else if (num1 + 2 == num2 && num3 + 1 == num2) {
            System.out.println(true);
        } else if (num1 + 1 == num3 && num2 + 2 == num3) {
            System.out.println(true);
        } else if (num1 + 2 == num3 && num2 + 1 == num3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void numUnique(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("1");
        } else if (num1 == num2 && num2 != num3) {
            System.out.println("2");
        } else if (num1 == num3 && num3 != num2) {
            System.out.println("2");
        } else if (num2 == num3 && num2 != num1) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }

    public static void randomWalk(int n) {
        System.out.println("walking " + n + " steps");
        Random random = new Random();
        int position = 0, max = position;
        int direction = 0;
        for (int i = 0; i < n; i++) {
            direction = random.nextInt(2);
            if (direction == 1)
                position += 1;
            else
                position -= 1;
            if (position > max)
                max = position;
            System.out.println("position = " + position);
        }
        System.out.println("max position = " + max);
    }
}


