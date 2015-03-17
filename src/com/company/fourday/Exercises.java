package com.company.fourday;

/**
 * @author Administrator
 * @time 2015/3/16
 * @description:
 */
public class Exercises {

    public static void exercisesOne() {
        System.out.println("//////////////////////");
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void exercisesTwo() {
//        System.out.println("  \\/");
        printSymbol(2, 1, 1, true);
        printSymbol(1, 2, 2, true);
        printSymbol(0, 3, 3, true);
        printSymbol(0, 3, 3, false);
        printSymbol(1, 2, 2, false);
        printSymbol(2, 1, 1, false);
//        System.out.println(" \\\\//");
//        System.out.println("\\\\\\///");
//        System.out.println("///\\\\\\");
//        System.out.println(" //\\\\");
//        System.out.println("  /\\");
    }

    public static void printSymbol(int isNum, int thisNum, int oneNum, boolean isFirst) {
        for (int i = 0; i < isNum; i++) {
            System.out.print(" ");
        }
        if (isFirst) {
            for (int j = 0; j < thisNum; j++){
                System.out.print("\\");}
            for (int k = 0; k < oneNum; k++){
                System.out.print("/");}

        } else {
            for (int k = 0; k < oneNum; k++){
                System.out.print("/");}
            for (int j = 0; j < thisNum; j++){
                System.out.print("\\");
        }}
        {
            System.out.println();
        }
    }


    public static void exercisesThree() {
        System.out.println("A well-formed Java program has");
        System.out.println("a main method with {and} ");
        System.out.println("braces.");

        System.out.println("A Syetm.out.println statement");
        System.out.println("has ( and ) and usually a");
        System.out.println("String that starts and ends");
        System.out.println("with a \" character");
        System.out.println("(But we type \\\" instead!");
    }

    public static void exercisesFour() {
        System.out.println("What is the difference between");
        System.out.println("a  ' and a \"? Or between a \" and a \\\"?");

        System.out.println("One is what we see when we're typing our program.");
        System.out.println("The other is what appears on the\"console\"");
    }

    public static void exercisesFive() {
//        System.out.println("//////////////////////");
        printSlash(22, false);
        System.out.println("|| Victory is mine! ||");
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        printSlash(22, true);
        System.out.println("|| Victory is mine! ||");
        printSlash(22, true);
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine! ||");
        printSlash(22, true);
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine! ||");
        printSlash(22, true);
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine! ||");
        printSlash(22, true);
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

    }

    public static void exercisesSix() {

    }


    private static void printSlash(int num, boolean isLeft) {
        for (int i = 0; i < num; i++) {
            if (isLeft) {
                System.out.print("\\");
            } else {
                System.out.print("/");
            }
        }
    }

    private static void printSpace(int num, boolean isTrue) {

        for (int j = 0; j < num; j++) {
            if (isTrue) {
                System.out.print(" ");
            }
            if (isTrue && false) {
                System.out.print("/");
            } else {
                System.out.print("\\/");

            }
        }
    }
}







