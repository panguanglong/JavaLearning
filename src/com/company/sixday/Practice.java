package com.company.sixday;

/**
 * @author Administrator
 * @time 2015/3/18
 * @description:
 */
public class Practice {

    public static void forPractice() {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int a = 0; a < 2; a++) {
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 2; l++) {
                    System.out.print(k);
                }
            }
        }
        System.out.println();

        for (int e = 0; e < 40; e++) {
            System.out.print("-");
        }
        System.out.println();
    }


    public static void forPracticeTwo() {
        for (int i = 0; i < 6; i++) {
            System.out.print("         |");
        }
        System.out.println();
        for (int a = 0; a < 6; a++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 1; k++)
                    System.out.print(j);
            }
        }
        System.out.println();
    }

    public static void forPracticeThree(int Num) {
        for (int k = 0; k < Num; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void forPracticeFour() {
        for (int i = 0; i < 5; i++) {
            for (int k = 9; k >= 0; k--) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }

    public static void forPracticeFive() {
        for (int i = 0; i < 4; i++) {
            for (int k = 9; k >= 0; k--) {
                for (int j = 0; j < k; j++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }

    public static void forPracticeSix() {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("-");
            }
        }
        for (int a = 1; a < 10; a += 2) {
            for (int b = 1; b < a + 1; b++) {
                System.out.print(a);
            }


        }
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("-");
            }

        }
        System.out.println();
    }
}

