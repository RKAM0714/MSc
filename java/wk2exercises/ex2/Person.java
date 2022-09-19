
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = false;
	int weeklyAlcoholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcoholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   System.out.print("Your BMI is " + getBMI());
	   
	}
	
	public void promptAttributes()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your weight, in kg:");
		kgWeight = sc.nextInt();
		
		System.out.println("Enter your height, in cm:");
		cmHeight = sc.nextInt();
		
		System.out.println("Enter how many units of alcohol you cosume per week:");
		weeklyAlcoholUnits = sc.nextInt();
		
		System.out.println("Enter your resting heart rate:");
		restPulse = sc.nextInt();
			
	}
	
	public double getBMI()
	{
		double BMI;
			BMI =  kgWeight/(cmHeight*cmHeight)*10000;
		return BMI;
	}
	
}
