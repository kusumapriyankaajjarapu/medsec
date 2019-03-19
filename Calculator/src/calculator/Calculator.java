/*
 * This program is used to calculate
        *The sum of n numbers
        *The multiplication of n numbers
        *The division of 2 numbers
 */
package calculator;

/**
 *
 * @author Kusuma Priyanka
 */
public class Calculator 
{
   //defines Addition of n numbers
        public float addition(float input[]){
           
            float sum = 0;
            for(int i = 0;i < input.length;i++)
            {
                sum += input[i];
            }
            
            return sum;
            
        }
        
        //defines Multiplication of n numbers
        public float multiplication(float input[]){
          
            float product = 1;
            for(int i = 0;i < input.length;i++)
            {
                product *= input[i];
            }
            
            return product;
            
        }
        
        //defines Division of 2 numbers
        public float division(float input[]) {
           
            float quotient;
            quotient = input[0] / input[1];
            
            return quotient;
            
        }
      
}
