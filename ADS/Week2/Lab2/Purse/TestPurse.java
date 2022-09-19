
public class TestPurse {

	public static void main(String[] args) {
		//Create a purse and some coins, then add the coins to the purse, 
		//and finally work out the total in the purse
		Purse p=new Purse();
		Coin c1=new Coin(10);
		Coin c2=new Coin(20);
		Coin c3=new Coin(30);
		
		p.addCoins(10, c1);
		p.addCoins(1, c2);
		p.addCoins(3, c3);
		
		System.out.println(p.getTotal());
	}

}
