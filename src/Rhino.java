/**
 * Created by hssen on 12/12/14.
 */
public class Rhino extends Animal implements WildAnimal {
    @Override
    public String sound()
    {
        return "Rhino sound";
    }

    @Override
    public String type() {
        return "Rhino";
    }

    @Override
    public String toString() {
        return "Rhino{}";
    }

    @Override
    public boolean wild(boolean b) {
        return true;
    }
}
