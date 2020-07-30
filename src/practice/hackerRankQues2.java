/*
 *CREATED BY INTELLIJ IDEA
 *Author: Mayank Bhugra
 *Date: 30-07-2020
 *Time: 20:51
 *File: hackerRankQues2.java
 */
package practice;

import java.util.Scanner;
// Static initialization based Question
public class hackerRankQues2 {
        static Scanner scan = new Scanner(System.in);
        static int B = scan.nextInt();
        static int H = scan.nextInt();
        static boolean flag = true;
        static {
                if ((B <= 0) || (H <= 0)) {
                    flag = false;
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                }
        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class


