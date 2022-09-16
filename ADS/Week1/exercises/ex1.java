
/**
 * Write a description of class Exciting here.
 * 
 * @author Ross M
 * @version 10/09/2022
 */
public class ex1
{
    //Put your declarations for a) beneath here 
     double z ;
     int count = 0;
     double cost = 3.45;
     char choice = 'X';
     boolean goodChoice = true;
     short lowest = 5;
    //Put your declarations and initialisations to b) beneath here 
     double roomTemp = 15;
     byte bonusBall = 6;
     int populationChina = 1000000000;
     boolean gameFinish = true;
     int planetaryDistance = 100000000;
     char grade = 'A';
    
   public void doit()
   {
     double x = 3.0;
     double y = 4.0;
     z = 2.0 * y + x/4.0 - (x + y ) ;
   }    
   
   public void displayDetails() 
   {
	   System.out.print("z= ");
	   System.out.println (z);
	   
	   //display the details for the variables you declared in a)
	   System.out.println("Variables from section a)");
	   System.out.println("Count = " + count);
	   System.out.println("Cost = " + cost);
	   System.out.println("Choice = " + choice);
	   System.out.println("Good Choice = " + goodChoice);
	   System.out.println("Lowest = " + lowest);
	   
	   //display the details for the variables you declared in b)
	   System.out.println("Variables from section b)");
	   System.out.println("Room temperature is " + roomTemp + " degrees Celsius");
	   System.out.println("Jackpot bonus balls number is  " + bonusBall);
	   System.out.println("The population of China is = " + populationChina);
	   System.out.println("Is the game finished?  Answer: " + gameFinish);
	   System.out.println("Interplanertary distance between A & B is " + planetaryDistance);
	   System.out.println("My A-level grade is " + grade);
	     
	   
   }
    
}

	   
    
 