package com.company.Fiveday;

/**
 * @author Administrator
 * @time 2015/3/17
 * @description:
 */
public class ExercisesTwo {
    public static void exercisesSix() {
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("-\"-\'-\"-\'-\"-");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");
    }

    public static void exercisesSeven() {
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");
        System.out.println("-\"-\'-\"-\'-\"-");
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");
        System.out.println("-\"-\'-\"-\'-\"-");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");
        System.out.println("  ------");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("-\"-\'-\"-\'-\"-");
        System.out.println("\\        /");
        System.out.println(" \\      /");
        System.out.println("  ------");

    }

    public static void exercisesEight() {
        System.out.println("   /\\        /\\");
        System.out.println("  /  \\      /  \\");
        System.out.println(" /    \\    /    \\ ");
        System.out.println("+-------+ +-------+");
        System.out.println("|       | |       |");
        System.out.println("|       | |       |");
        System.out.println("+-------+ +-------+");
        System.out.println("|United | |United |");
        System.out.println("|States | |States |");
        System.out.println("+-------+ +-------+");
        System.out.println("|       | |       |");
        System.out.println("|       | |       |");
        System.out.println("+-------+ +-------+");
        System.out.println("   /\\        /\\   ");
        System.out.println("  /  \\      /  \\");
        System.out.println(" /    \\    /    \\");
    }

    public static void exercisesNine(int printNum) {
        for (int i = 0; i < printNum; i++) {
            System.out.println("All work and no play makes Jack a dull boy");
        }
    }


    public static void printGraphicalOne() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void printGraphicalTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void printDigitalOne() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void printDigitalTwo() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }


    public static void printDigitalThree(int Law) {
        for (int i = Law; i >= 1; i--) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            int value = Law - (i - 1);
            for (int k = 1; k <= (Law - i + 1); k++) {
                System.out.print("" + value);
            }
            System.out.println();
        }
    }

    public static void printDigitalExerciseEight(int num) {
        for (int i = 0; i < num; i++) {
            //打印空格
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            //打印数字
            int value = i + 1;
            for (int k = 0; k < i + 1; k++) {
                System.out.print("" + value);
            }
            //换行
            System.out.println();
        }
    }


    public static void printLaw() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
    }
}

