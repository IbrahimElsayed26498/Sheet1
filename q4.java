package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double F = input.nextDouble();
        double C = (F - 32) * 5.0 / 9.0;
        System.out.println(F + " degree Fahrenheit is equal to " + C + " in Celsius");
    }
}
