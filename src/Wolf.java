/**
 * Created by hssen on 12/12/14.
 */
public class Wolf extends Animal implements WildAnimal{
    @Override
    public String sound()
    {
        return "Wolf sound";
    }

    @Override
    public String type() {
        return "Wolf";
    }

    @Override
    public String toString() {
        return "Wolf{}";
    }

    @Override
    public boolean wild(boolean b) {
        return true;
    }
}
