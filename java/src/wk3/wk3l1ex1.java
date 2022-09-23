package wk3;

public class wk3l1ex1 extends Account {
//instance variables
    private double monthlyInterestRate;
    public double monthlyInterest;

// constructor
    public wk3l1ex1 (double balance, double monthlyInterestRateIn) {
        super(balance);
        monthlyInterestRate = monthlyInterestRateIn;
    }

    public void addMonthlyInterest() {
        monthlyInterest = getBalance() * monthlyInterestRate;
        credit(monthlyInterest);
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate (double newMonthlyInterestRate){
        monthlyInterestRate = newMonthlyInterestRate;
    }

    public String toString(){
        return super.toString() + " Monthly Interest Rate: " + monthlyInterestRate;
    }

}
