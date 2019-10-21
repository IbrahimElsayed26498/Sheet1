package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        sum += number/100;
        number = number % 100;
        sum += number/10;
        number = number%10;
        sum += number;

        System.out.println("The sum of all digits in " + temp + " is " + sum);
    }

} 
