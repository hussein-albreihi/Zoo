/**
 * Created by hssen on 12/12/14.
 */
public class Dog extends Animal implements TameAnimal {
    @Override
    public String sound()
    {
        return "Dog sound";
    }

    @Override
    public String type() {
        return "Dog";
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    @Override
    public boolean tameAnimal(boolean b) {
        return true;
    }
}
