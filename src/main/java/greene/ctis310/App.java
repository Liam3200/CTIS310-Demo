package greene.ctis310;

import java.util.ArrayList;

/**
 * Liam Greene 
 * CTIS 310
 * 4/20/2023
 */
public class App {
    public static void main(String[] args) {
        // intialize a dog with random attributes
        Dog dog = new Dog("Jeff", 4, "Bulldog", "Black");
        // create an arraylist of dogs and add the dog to it
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog);
        // create a loop that intializes and adds 5 dogs to the arraylist
        for (int i = 0; i < 5; i++) {
            dogs.add(new Dog());
        }

        // give each dog a random name without a loop
        dogs.get(1).setName("Bob");
        dogs.get(2).setName("Joe");
        dogs.get(3).setName("Steve");
        dogs.get(4).setName("Bill");
        dogs.get(5).setName("John");

        // give each dog a random age 
        for (Dog d : dogs) {
            d.setAge((int) (Math.random() * 15));
        }

        //create a lamda expression that prints out each dog
        dogs.forEach((d) -> {
            System.out.println(d);
        });
        

        // create a loop that makes each dog bark a random number of times
        for (Dog d : dogs) {
            for (int i = 0; i < (int) (Math.random() * 10); i++) {
                d.bark();
            }
        }

        // create a loop that prints out the number of times each dog barked
        for (Dog d : dogs) {
            System.out.println(d.getName() + " barked " + d.getBarked() + " times.");
        }

    }
}
