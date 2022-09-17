
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
	
public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	public void displayKlingonDetails()
	{
		System.out.println("Power is at " + photonPower);
		System.out.println("Current Threat Factor is a " + threatFactor);
		System.out.println("Nearest cosmic entity is " + cosmicProximity + " light years away");
		System.out.println("Current danger level is estimated at " + getDangerLevel());
	}
	
	public double getDangerLevel()
	{
		double dangerLevel;
		
		dangerLevel = (photonPower * threatFactor) / cosmicProximity;
		return dangerLevel;		
	}
	
	public void promptSettings()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the photon power:");
		photonPower = sc.nextInt();
		
		System.out.println("Enter the threat factor:");
		threatFactor = sc.nextInt();
	
		System.out.println("Enter the cosmic proximity:");
		cosmicProximity = sc.nextInt();
	}
}
