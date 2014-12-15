/**
 * Created by hssen on 12/8/14.
 */
public abstract class Animal {

    public String sound() {

        return null;
    }

    public String type() {
        return null;
    }

    @Override
    public String toString() {
        return "Animal{}";
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) return false;
        if (this.getClass() == o.getClass()) return true;


        return false;
    }

}
