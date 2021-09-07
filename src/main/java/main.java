/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the order amount? ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.printf("What state do you live in? ");
        String state = sc.nextLine();
        double tax = 0;
        if (Objects.equals(state,"Wisconsin"))
        {
            System.out.printf("What county do you live in? ");
            String county = sc.nextLine();
            if (Objects.equals(county, "Eau Claire"))
                tax = .055;
            else if (Objects.equals(county, "Dunn"))
                tax = .054;
            else
                tax = .05;
            System.out.printf("The tax is $%.2f\n", tax*amount);
        }
        else if (Objects.equals(state, "Ellinois"))
        {
            tax = .08;
            System.out.printf("The tax is $%.2f\n", tax * amount);
        }
        else{}

        System.out.printf("The total is $%.2f\n", amount + tax*amount);
    }
}