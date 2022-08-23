package morgage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        int principal = (int)mortgage.readNumber("Principal: ",1000,1000000);
        float annualInterest = (float) mortgage.readNumber("Annual Interest Rate: ", 1,30);
        byte years = (byte) mortgage.readNumber("Period (YEARS): ", 1,30);
    }
}

