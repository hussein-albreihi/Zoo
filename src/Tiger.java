/**
 * Created by hssen on 12/12/14.
 */
public class Tiger extends Animal implements WildAnimal{
    @Override
    public String sound()
    {
        return "Tiger sound";
    }

    @Override
    public String type() {
        return "Tiger";
    }

    @Override
    public String toString() {
        return "Tiger{}";
    }

    @Override
    public boolean wild(boolean b) {
        return true;
    }
}
