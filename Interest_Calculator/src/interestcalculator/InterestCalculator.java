/*
 *This program calculates the Simple Interest and Compound Interest 
 */
package interestcalculator;

//To use pow function
import java.math.*;
/**
 *
 * @author Kusuma Priyanka
 */
public class InterestCalculator {
    
    double principal_amount;
    double time;
    double rate_of_interest;
    
    //defines Constructor
    public InterestCalculator(double p,double t,double r){
       
        principal_amount = p;
        time = t;
        rate_of_interest = r;
    }
   
    //Calculates Simple Interest
    public double simpleInterest(){
        
        double si = (principal_amount * time * rate_of_interest) / 100;
        
        return si;
        
    }
    
    //Calculates Compound Interest
    public double compoundInterest(){
    
        double ci = principal_amount * Math.pow((1 + rate_of_interest / 100) , time) - principal_amount;
        
        return ci;
        
    }
}
