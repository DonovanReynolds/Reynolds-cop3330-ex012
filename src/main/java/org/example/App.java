package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 12 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String principalText = inputOutput("Enter the principal:");
        String rateText = inputOutput("Enter the rate of interest:");
        String yearsText = inputOutput("Enter the number of years:");

        int principal = stringToInt(principalText);
        double rate = stringToDouble(rateText)/100;
        int years = stringToInt(yearsText);
        double total = Math.ceil(principal*(1+rate*years)*100)/100;

        String output = String.format("After %d years at %.1f%%, the investment will be worth $%.2f",years,rate*100,total);
        System.out.println(output);
    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String text)
    {
        return Integer.parseInt(text);
    }

    public static double stringToDouble (String text)
    {
        return Double.parseDouble(text);
    }

}
