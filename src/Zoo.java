/**
 * Created by hssen on 12/9/14.
 */
public class Zoo {

    Animal[] animals = new Animal[5];
    Animal[] wildAnimal= new Animal[5];
    Animal[] tempArray;
    Animal[] tempWildArray;
    int nextIndex = 0;
    int nextWildIndex = 0;

    public void addAnimal(Animal animal) {
        if (animalAlreadyExists(animal)) {
            System.out.println("Can't add same animal twice!");
        } else if (animal instanceof TameAnimal) {
            System.out.println("The animal " + animal.type() + " is Tame!");
            if (animals[nextIndex] == null) {
                animals[nextIndex] = animal;
                nextIndex += 1;
            }
        }
        if (wildAnimalAlreadyExists(animal)) {
            System.out.println("Can't add same animal twice!");
        } else if (animal instanceof WildAnimal) {
            System.out.println("The animal " + animal.type() + " is Wild!");
            if (wildAnimal[nextWildIndex] == null) {
                wildAnimal[nextWildIndex] = animal;
                nextWildIndex += 1;
            }
        }

        if (animals[animals.length - 1] != null) {
            tempArray = new Animal[animals.length + 5];
            System.arraycopy(animals, 0, tempArray, 0, animals.length);
            animals = tempArray;
        }

        if (wildAnimal[wildAnimal.length - 1] != null) {
            tempWildArray = new Animal[wildAnimal.length + 5];
            System.arraycopy(wildAnimal, 0, tempWildArray, 0, wildAnimal.length);
            wildAnimal = tempWildArray;
        }


    }

    private boolean animalAlreadyExists(Animal animalObject)
    {
        for (Animal animal : animals)
        {
            if (animalObject.equals(animal))
            {
                return true;
            }
        }
        return false;
    }

    private boolean wildAnimalAlreadyExists(Animal animalObject)
    {
        for (Animal animal : wildAnimal)
        {
            if (animalObject.equals(animal))
            {
                return true;
            }
        }
        return false;
    }


    public void makeAnimalSound() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].sound());
            }
        }
    }

    public void makeWildAnimalSound() {
        for (int i = 0; i < wildAnimal.length; i++) {
            if (wildAnimal[i] != null) {
                System.out.println(wildAnimal[i].sound());
            }
        }
    }
}
