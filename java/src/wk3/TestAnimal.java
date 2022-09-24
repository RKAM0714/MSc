package wk3;
/**
 * class TestAccounts .
 * 
 */
public class TestAnimal
{
    public static void main (String[] args) {
        Dog myDog = new Dog("Collie", 90);
        System.out.println(myDog.toString());
        myDog.setExerciseTime(120);
        System.out.println(myDog.toString());
        System.out.println("The changed exercise is to " + myDog.getExerciseTime());

        Cat myCat = new Cat("Inky");
        System.out.println(myCat.toString());
        myCat.loseLife();
        System.out.println("Inky has " + myCat.getLivesLeft() + " lives left");
    }

}
