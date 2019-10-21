package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int distance = input.nextInt();
        System.out.print("Input hour: ");
        int hours = input.nextInt();
        System.out.print("Input minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        double totalTimeInSeconds = seconds + (minutes * 60) + (hours * 60 * 60);
        double speedMperS = (double) distance / totalTimeInSeconds;
        System.out.println("Your speed in meters/second is " + speedMperS);

        // just convert from m/s to km/hour
        double speedKMperH = speedMperS * ((60.0 * 60.0)/1000.0);
        System.out.println("Your speed in km/h is " + speedKMperH);

        // convert from m/s to mile/hour
        double speedMilePerH = speedMperS * ((60.0 * 60.0)/1609.0);
        System.out.println("Your speed in miles/h " + speedMilePerH);
    }
}
 
