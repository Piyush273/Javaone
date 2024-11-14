package Mytask;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //Enter input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 5");
        int n = sc.nextInt();

        for(int i = 0; i < n ;i++)
        {
            for(int j = 0; j<=i ;j++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
