/**
 * Created by hssen on 12/12/14.
 */
public class Parrot extends Animal implements TameAnimal {
    @Override
    public String sound()
    {
        return "Parrot sound";
    }

    @Override
    public String type() {
        return "Parrot";
    }

    @Override
    public String toString() {
        return "Parrot{}";
    }

    @Override
    public boolean tameAnimal(boolean b) {
        return true;
    }
}
