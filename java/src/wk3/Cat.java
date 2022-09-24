package wk3;

public class Cat extends wk3l1ex2 {
    private int livesLeft = 9;
    private String catLifeDisplay;

    public Cat(String nameIn){
        super(nameIn);
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void loseLife() {
        --livesLeft;
    }

    @Override
    public String toString() {
        if(getLivesLeft()>0){
            catLifeDisplay = "The cat has " + getLivesLeft() + " left";
        }
        else if(getLivesLeft() == 0) {
            catLifeDisplay = "The cat is dead";
        }
        return super.toString() + "; The cat has " + catLifeDisplay + " lives left";
    }
}
