/**
 * Created by hssen on 12/12/14.
 */
public class Cat extends Animal implements TameAnimal {
    @Override
    public String sound()
    {
        return "Cat sound";
    }

    @Override
    public String type() {
        return "Cat";
    }

    @Override
    public String toString() {
        return "Cat{}";
    }

    @Override
    public boolean tameAnimal(boolean b) {
        return true;
    }
}
