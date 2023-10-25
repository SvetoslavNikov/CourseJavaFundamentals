package objectsAndClasses.Lab;

import java.util.Random;

public class Dice {
    private int sides;

    //default constructor
    public Dice() {

    }

    public Dice(int sides) {
        this.sides = sides;
    }

    //getter
    public int getSides() {
        return this.sides;
    }

    //setter
    public void setSides(int sides) {
        this.sides = sides;
    }

    public int row() {
        Random r1 = new Random();
        int randomSide = r1.nextInt(6);
        return randomSide;
    }
}
