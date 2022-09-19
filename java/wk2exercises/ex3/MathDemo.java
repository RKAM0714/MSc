
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
	int number1, number2, number3;
			
	public int generateLottoNumber()
	{
		int lottoNumber;
		lottoNumber = (int)(Math.random()*99 +1);
		return lottoNumber;
	}
	
	public int getMax()
	{
		int maxNum;
		maxNum = Math.max(number1, number2);
		maxNum = Math.max(maxNum, number3);
		return maxNum;
	}
	
	public void bestOfThree()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide three integers, press enter after each number");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		System.out.println("The largest number you entered was... " + getMax());
	}
	
}
