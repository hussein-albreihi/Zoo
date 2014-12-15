/**
 * Created by hssen on 12/9/14.
 */
public class Snake extends Animal implements WildAnimal  {

    @Override
    public String sound()
    {
        return "Snake sound";
    }

    @Override
    public String type() {
        return "Snake";
    }

    @Override
    public String toString() {
        return "Snake{}";
    }

    @Override
    public boolean wild(boolean b) {
        return true;
    }
}
