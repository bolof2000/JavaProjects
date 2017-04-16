package inheritance;

/**
 * Created by BOLOFBABA on 4/11/2017.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);  // from the Animal Base class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat()
    {
        //System.out.println("Dog.eat() called");
        chew();
        super.eat();  // Animal eat method is called here
    }

    @Override
    public void move(int speed) {
        System.out.print("dog.move() is called "+ speed);  // dog class will be called
        super.move(speed);                   //animal class move wiill be called
    }
    public void run()
    {
        System.out.println("dog.run is called");
        move(10);  // from the animal class is called
    }
}
