package ProblemSolving;

import java.util.Scanner;
/*
 * Problem

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00PM on a 12-hour clock, and 12:00:00PM on a 24-hour clock.
 */
public class Timeconversion {
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        String time = obj.next();
        String[] listtime = time.split(":");
        String hours = listtime[0];
        String minutes = listtime[1];
        String secounds = listtime[2].substring(0, 2);
        String caser = listtime[2].substring(2, 4);

        if(caser.equals("AM")) {
            if(hours.equals("12")) {
                hours = "00";
            }
            System.out.print(hours+":"+minutes+":"+secounds);
        }else {
            if(!hours.equals("12")) {

                int h = Integer.parseInt(hours);
                h = h+ 12;
                hours = Integer.toString(h);

            }
            System.out.print(hours+":"+minutes+":"+secounds);
        }
    }
}
