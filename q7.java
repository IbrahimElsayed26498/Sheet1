package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int number = input.nextInt();
        int n1, n2, n3, n4, n5, n6;
        n1 = number / 100000;
        number %= 100000;
        n2 = number / 10000;
        number %= 10000;
        n3 = number / 1000;
        number %= 1000;
        n4 = number / 100;
        number %= 100;
        n5 = number / 10;
        number %= 10;
        n6 = number;
        String output = n1 + " " + n2 + " " + n3 + " " + n4
                + " " + n5 + " " + n6;
        System.out.println(output);

    }
}
 
