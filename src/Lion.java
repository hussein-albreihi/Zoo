/**
 * Created by hssen on 12/12/14.
 */
public class Lion extends Animal implements WildAnimal {
    @Override
    public String sound()
    {
        return "Lion sound";
    }

    @Override
    public String type() {
        return "Lion";
    }

    @Override
    public String toString() {
        return "Lion{}";
    }

    @Override
    public boolean wild(boolean b) {
        return true;
    }
}
