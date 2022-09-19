
/**
 * A class to hold the declarations and Expressions 
 * 
 * @author Ross
 * @version 16.09.22
 */
public class Ex3Amazing
{
   //Put your data type declarations below. Here is an example
    float x = 2.5f;
    float y = -1.5f;
    int m = 18;
	int n = 4;
	float calc1, calc2, calc3;
	     

//Put the code for your calculations in this method.   
   void doCalculations()
   {
	   calc1 = x + n * y - (x+n) * y;
	   System.out.println("Calculation 1 = " + calc1);
	   
	   calc2 = m / n + m % n;
	   System.out.println("Calculation 2 = " + calc2);
	   
	   calc3 = 5 * x - n / 5;
	   System.out.println("Calculation 3 = " + calc3);      
   }//End of doCalculations
}
