/*
 * This is the client application for Calculator program
 */
package calculator;

//To use Scanner Class
import java.util.*;

/**
 *
 * @author Kusuma Priyanka
 */
public class CalculatorClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test case 1 : reads input from user
        //creates object for Calculator class
            Calculator c = new Calculator();
            Scanner scan = new Scanner(System.in);
            
        //create an array to store input numbers
        //Enter no of input numbers
            int number = scan.nextInt();    
            float input[] = new float[number];
            
        //Read input 
            for(int i = 0;i < number;i++)
            {
                input[i] = scan.nextFloat();
            }
            float sum,product,quotient;
            sum = c.addition(input);
            product = c.multiplication(input);
            quotient = c.division(input);
            
        //Test case 2 : static inputs
            number = 5;
            input = new float[]{1,2,3,4,5};
        //Test case 3 : if a[1]=0
            number = 5;
            input = new float[]{1,0,3,1,2};
        //Test case 3 : if all inputs are 0
            number = 5;
            input = new float[]{0,0,0,0,0};
        //Test case 4 : if the number of inputs provided exceed the prior given value "number"
            number = 5;
            input = new float[]{1,2,3,1,2,6,4};
        //Test case 5 : if the number of inputs provided are less than the prior given value "number"
            number = 5;
            input = new float[]{1,2,3};
        //Test case 6 : if the inputs are negative
            number = 5;
            input = new float[]{1,-2,3,-1,-3};
            
    }
    
}
