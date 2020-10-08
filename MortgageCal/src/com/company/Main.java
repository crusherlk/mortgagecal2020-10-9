package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal ($1K-$1M): ");
            principal = scanner.nextInt();
            if (principal >=1000 && principal<=1000000)
                break;
            System.out.println("Enter a value $1K-$1M");
        }

        float interest;
        float monthlyInterest;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest= scanner.nextFloat();
            monthlyInterest = interest/12/100;
            if (interest >=1 && interest<=30)
                break;
            System.out.println("Enter a value 1%-30%");
        }


        int period=0;
        int totPays;
        while (true) {
            System.out.print("Period (years): ");
            period = scanner.nextInt();
            totPays = period*12;
            if (period >=1 && period<=30)
                break;
            System.out.println("Enter a value 1-30");
        }

        double mortgage;

        mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,totPays))/Math.pow(1+monthlyInterest,totPays)-1;

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormat);
    }
}
