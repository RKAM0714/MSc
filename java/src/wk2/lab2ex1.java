import java.util.*;

public class lab2ex1 {
    public void guessMyFavouriteThing() {
        //Create a string object with your favourite animal, car ..whatever
        //e.g String favMotorBikeManufacturer = "bmw"
        String favAnimal = "PolarBear";
        int strLengthAnimal = favAnimal.length();
        char strFirstLetter = favAnimal.charAt(0);

        // Now prompt for a guess - using the Scanner class
        // ** Using String methods, you should give the length
        // ** and first letter of your favourite thing in the prompt.

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my favourite animal! It has " + strLengthAnimal + " characters and begins with the letter " + strFirstLetter);
        String guessAnimal = sc.next();

        // Now test if the guess was correct - ignore case

        if (favAnimal.equalsIgnoreCase(guessAnimal)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong, ya fool");
        }
    }//end guessing


    public static void main(String args[]) {
        //Create WrappedUp object and test the methods
        lab2ex1 fav = new lab2ex1();
        fav.guessMyFavouriteThing();

    }

}