package Mytask;

import java.util.Scanner;

//User Input in Arrays
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size");
        int size = sc.nextInt();
        //Array define
        int[] numbers = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.printf("Enter the number " +(i+1)); //i+1 means i value start with 1
            numbers[i] =sc.nextInt();
        }

        System.out.println("-------------");
        //print the numbers entered by the user
        System.out.println("The numbers are:");
        for(int i=0;i < numbers.length;i++) // for(int=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }


    }
}
