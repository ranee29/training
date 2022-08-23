package morgage;

import java.util.Scanner;

public class mortgage {//    public static void displayMonthly(double mortgage, byte years) {

    //        mortgage *=(years *12);
//        System.out.println(mortgage);
//    }
    private final static byte months_in_years = 12;
    private  final static byte percent = 100;
    private static float monthlyInterest(float annualInterest){

        float monthlyInterest = annualInterest / percent /months_in_years;
        return monthlyInterest;
    }
    private static short numberOfMonths(short years){
        return (short) (months_in_years * years);
    }

    public  static double calculateBalance(int principal,
                                           byte years,
                                           float annualInterest,
                                           short numberOfPaymentsMade){

        double balance = principal *
                (Math.pow(1 + monthlyInterest(annualInterest),numberOfMonths(years)) - Math.pow(1 + monthlyInterest(annualInterest),numberOfPaymentsMade))
                / (Math.pow(1+monthlyInterest(annualInterest),numberOfMonths(years)) - 1);
        return  balance;

    }

    public static double readNumber(String prompt,double min, double max){
        Scanner sc = new Scanner(System.in);
        double amount;

        while (true){
            System.out.print(prompt);
            amount = sc.nextDouble();
            if(amount>=min && amount<=max)
                break;
        }
        return amount;
    }
    public static double calculateMortgage(int principal,
                                           byte years,
                                           float annualInterest) {
        float monthlyInterest = 0;

        monthlyInterest =monthlyInterest(annualInterest);
        int numberOfPayments = years * months_in_years;
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;

    }

}