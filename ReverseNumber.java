package com.day01;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the digit from user
        System.out.print("Enter the random number: ");
        int n = sc.nextInt();
        int rev = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Original number: " + original + ", Reversed number: " + rev);
        sc.close();
    }
}
