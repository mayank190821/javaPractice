/*
 *CREATED BY INTELLIJ IDEA
 *Author: Mayank Bhugra
 *Date: 30-07-2020
 *Time: 20:29
 *File: hackerRankQues1.java
 */
package practice;
// hasNext() question in hackerrank
import java.util.Scanner;

public class hackerRankQues1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int i=1;
        do {
            String str = sc.nextLine();
            System.out.println(i+str);
            i++;
        }while(sc.hasNext());
    }
}
