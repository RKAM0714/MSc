
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
	
}
