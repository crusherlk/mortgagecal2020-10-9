package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest/12/100;

        System.out.print("Period (years): ");
        int period = scanner.nextInt();
        int totPays = period*12;

        double mortgage;

        mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,totPays))/Math.pow(1+monthlyInterest,totPays)-1;

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormat);
    }
}
