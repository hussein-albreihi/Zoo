/**
 * Created by hssen on 12/9/14.
 */
public class AnimalsTest {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimal(new Giraffe());
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Monkey());
        zoo.addAnimal(new Cat());
        zoo.addAnimal(new Parrot());

        zoo.addAnimal(new Snake());
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Tiger());
        zoo.addAnimal(new Rhino());
        zoo.addAnimal(new Wolf());

        zoo.makeAnimalSound();
        zoo.makeWildAnimalSound();
    }
}
