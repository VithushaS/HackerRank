package ProblemSolving;

import java.util.Scanner;

public class Gradingstudents {
    /*
 * Every student receives a  in the inclusive range from  0 to 100.
Any grade  less than 40 is a failing grade. Sam is a professor at the university and likes
 to round each student's  grade according to these rules:
  If the difference between the  grade and the next multiple of  is 5 less than 3 ,
  round grade up to the next multiple of 5. If the value of  grade is less than 38 ,
   no rounding occurs as the result will still be a failing grade.
 */


        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();

            for(int i =0;i<n;i++) {
                int grade = obj.nextInt();
                if(grade>=38) {
                    if(grade%5 >=3) {
                        int rem = grade%5;
                        grade += 5-rem;
                    }
                }
                System.out.println(grade);
            }

        }
}
