/**
 * Created by hssen on 12/9/14.
 */
public class Monkey extends Animal implements TameAnimal{

    @Override
    public String sound()
    {
        return "Monkey sound";
    }

    @Override
    public String type() {
        return "Monkey";
    }

    @Override
    public String toString() {
        return "Monkey{}";
    }

    @Override
    public boolean tameAnimal(boolean b) {
        return true;
    }
}
