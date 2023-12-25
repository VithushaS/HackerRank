package ProblemSolving;

import java.util.Scanner;
/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times
she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season,
and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during
the season.
Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4
 */
public class BreakingtheRecords {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
         a[i] = obj.nextInt();
        }
        int max = a[0];
        int min =a[0];
        int maxCount=0;
        int minCount=0;
        for(int i=1;i<n;i++){
            if(max<a[i]) {
                maxCount++;
                max = a[i];
            }
            if(min>a[i]) {
                minCount++;
                min = a[i];
            }
        }
        System.out.println(maxCount+" "+minCount);
    }
}
