/*
 * This is client application for the Interest Calculator program
 */
package interestcalculator;

//To use Scanner class
import java.util.*;

/**
 *
 * @author Kusuma Priyanka
 */
public class InterestCalculator_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Test case 1 : reading inputs from user
            Scanner scan = new Scanner(System.in);
        
            //Read inputs
            double principal_amount = scan.nextDouble();
            double time = scan.nextDouble();
            double rate_of_interest = scan.nextDouble();
        
            //create object
            InterestCalculator c = new InterestCalculator(principal_amount,time,rate_of_interest);
        
            //Calculate Simple Interest
            double si = c.simpleInterest();
        
            //Calculate Compound Interest
            double ci = c.compoundInterest();
            
        //Test case 2 : testing float inputs
            principal_amount = 500.50;
            time = 2.5;
            rate_of_interest = 7.2;
            InterestCalculator c1 = new InterestCalculator(principal_amount,time,rate_of_interest);
            si = c1.simpleInterest();
            ci = c1.compoundInterest();

        //Test case 3 : testing low boundary values
            principal_amount = 5;
            rate_of_interest = 0.2;
            time = 0.2;
            InterestCalculator c2 = new InterestCalculator(principal_amount,time,rate_of_interest);
            si = c2.simpleInterest();
            ci = c2.compoundInterest();


        //Test case 4 : testing high boundary values
            principal_amount = 5000000;
            rate_of_interest = 7.2;
            time = 20;
            InterestCalculator c3 = new InterestCalculator(principal_amount,time,rate_of_interest);
            si = c3.simpleInterest();
            ci = c3.compoundInterest();


        //Test case 4 : inputs as 0
            principal_amount = 50000;
            rate_of_interest = 0;
            time = 2;
            InterestCalculator c4 = new InterestCalculator(principal_amount,time,rate_of_interest);
            si = c4.simpleInterest();
            ci = c4.compoundInterest();


        //Test case 5: if all inputs are 0
            principal_amount = 0;
            rate_of_interest = 0;
            time = 2;
            InterestCalculator c5 = new InterestCalculator(principal_amount,time,rate_of_interest);
            si = c5.simpleInterest();
            ci = c5.compoundInterest();

        
    }
    
}
