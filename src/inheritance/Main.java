package inheritance;

/**
 * Created by BOLOFBABA on 4/11/2017.
 */
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("bINGO",4,4,5,6,7,7,4,6,"COOLING");

        dog.eat();  // which is called? from animal or dog class ? this is to test Override functtionality
        dog.run();
        dog.move(10); // which is called? move method is defined in both Animal and dog class?



            }

}

