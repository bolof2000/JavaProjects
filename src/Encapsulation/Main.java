package Encapsulation;

/**
 * Created by BOLOFBABA on 4/14/2017.
 */
public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 50, true);
        //printer.addToner(50);

        System.out.print("Total toner level is " + printer.addToner(50));

    }
}
