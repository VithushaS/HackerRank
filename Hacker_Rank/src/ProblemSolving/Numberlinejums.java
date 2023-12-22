package ProblemSolving;
/*
 * You are choreographing a circus show with various animals. For one act,
you are given two kangaroos on a number line ready to jump in the positive direction
 * (i.e, toward positive infinity).

The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
If it is possible, return YES, otherwise return NO.

Example

x1 = 2
v1 = 1
x2 = 1
v2 = 2
After one jump, they are both at x = 3, (x1 + v1 = 2 + 1, x2 + v2 = 1 + 2), so the answer is YES.

 */
import java.util.Scanner;

public class Numberlinejums {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int newx1=x1;
        int newx2=x2;
        if(v1<v2){
            return "NO";
        }
        while(newx1<newx2){
            newx1 = newx1+v1;
            newx2 = newx2+v2;
            if(newx1 == newx2){
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int x1 = obj.nextInt();
        int v1 = obj.nextInt();
        int x2 = obj.nextInt();
        int v2 = obj.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));
    }

}
