
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex2Person
{
	double cmHeight = 176 ;
	double kgWeight = 85;
	boolean smoker = false;
	int weeklyAlcoholUnits = 0;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 56;
	char gender = 'm';

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcoholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	
	public void displayDetails()
	{
		System.out.println(cmHeight);
		System.out.println(kgWeight);
		System.out.println(smoker);
		System.out.println(weeklyAlcoholUnits);
		System.out.println(RWAL);
		System.out.println(restPulse);
	}
	
}
