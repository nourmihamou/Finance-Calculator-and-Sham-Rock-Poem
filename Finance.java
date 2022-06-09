import java.util.Scanner;

/**
 * This program takes as input the present value, annual interest and length of a loan and calculates the 
 * monthly payment, total payment the potential future value given a specified amount.  
 *
 * @author Nour Mihamou and Lulama Nyembe
 * @version 03/12/2021
 */
public class Finance
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the present value of your loan: ");
        double presentValue = keyboard.nextDouble();
        
        System.out.print("Enter the length of your loan in years: ");
        int numYears = keyboard.nextInt();
        
        System.out.print("Enter the annual interest rate on your loan: ");
        double yearlyRate = keyboard.nextDouble();
        
        System.out.println();
        
        double numMonths = numYears * 12.0;
        double monthlyRate = (yearlyRate / 100.0) / 12.0;
        double payment = (presentValue * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -numMonths)));
        System.out.print("Your monthly payment is $");
        System.out.printf("%.2f.%n", payment);
        
        double totalPayment = numMonths * payment;
        System.out.print("Your total payment at the end of the loan is $");
        System.out.printf("%,.2f.%n", totalPayment);
        System.out.println();
        
        double cashFlow = payment;
        double futureValue = payment * ((Math.exp(monthlyRate * numMonths) - 1) / (Math.exp(monthlyRate) - 1));
        
        System.out.printf("If you invested $%.2f", payment);
        System.out.println(" at the same interest rate for the same amount of time,");
        System.out.print("the estimated future value of your investment would be $");
        System.out.printf("%,.2f.%n", futureValue);
    }
}
