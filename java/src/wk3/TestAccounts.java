package wk3;
/**
 * class TestAccounts .
 * 
 */
public class TestAccounts
{
    public static void main (String args[])
    {
     wk3l1ex1 newacc = new wk3l1ex1(10000,0.25);
     newacc.addMonthlyInterest();
     System.out.println(newacc.toString());
     newacc.setMonthlyInterestRate(0.1);
     newacc.addMonthlyInterest();
     System.out.println(newacc.toString());
    }

}
