package com.company.twoday;

import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/3/11
 * @description:
 */

public class Year {
    public static void sayYear() {
        Scanner year = new Scanner(System.in);

        int y = Integer.parseInt(year.next());

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
