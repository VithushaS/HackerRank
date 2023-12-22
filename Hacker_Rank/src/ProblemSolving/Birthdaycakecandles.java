package ProblemSolving;

import java.util.Scanner;

public class Birthdaycakecandles {
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int tallest= 0;
        int frequency=0;

        for(int i=0;i<n;i++) {
            int height =obj.nextInt();
            if(height>tallest) {
                tallest = height;
                frequency = 1;
            }else if(height ==tallest) {
                frequency++;
            }

        }
        System.out.print(frequency);
    }
}
