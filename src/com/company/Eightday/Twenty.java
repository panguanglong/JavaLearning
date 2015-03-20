package com.company.Eightday;

import java.awt.*;
import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/3/20
 * @description:
 */
public class Twenty {
    public static void printOdds(int n) {
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }

    public static void halfTheFun(int number) {
        number = number / 2;
        for (int count = 1; count <= number; count++) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    public static void sentence(String three, String one, int number) {
        System.out.println(one + " times " + three + " = " + (number * 2));
    }

    public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }

    public static void printName(){
        Scanner name=new Scanner(System.in);
        System.out.println("Please enter your Surname:");
        String n =name.nextLine();
        System.out.println("name:");
        String full=name.nextLine();
        System.out.println("Your name in reverse order is "+full+","+n);
    }
    public static void swapPoints(){
        Point p1 =new Point(5,3);
        Point p2 =new Point(-3,6);

        System.out.println("(" + p1.x + "," + p1.y + ")");
        System.out.println("("+p2.x+","+p2.y+")");
    }




}
