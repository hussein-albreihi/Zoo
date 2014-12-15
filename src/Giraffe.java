/**
 * Created by hssen on 12/9/14.
 */
public class Giraffe extends Animal implements TameAnimal {

    @Override
    public String sound()
    {
        return "Giraffe sound";
    }

    @Override
    public String type() {
        return "Giraffe";
    }

    @Override
    public String toString() {
        return "Giraffe{}";
    }


    @Override
    public boolean tameAnimal(boolean b) {
        return true;
    }
}
