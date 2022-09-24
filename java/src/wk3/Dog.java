package wk3;

public class Dog extends wk3l1ex2 {
    private int exerciseTime;

    public Dog(String nameIn, int exerciseTimeIn){
        super(nameIn);
        exerciseTime = exerciseTimeIn;
    }

    public int getExerciseTime() {
        return exerciseTime;

    }

    public void setExerciseTime(int exerciseTimeNew) {
        exerciseTime = exerciseTimeNew;
    }

    @Override
    public String toString() {
        return super.toString() + "; The dogs exercise is " + exerciseTime;
    }
}
