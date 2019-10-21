package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        int s = input.nextInt();
        System.out.println("The area of the hexagon is: " +
                ((6.0 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6))));
    }
}
 
