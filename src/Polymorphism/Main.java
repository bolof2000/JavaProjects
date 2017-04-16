package Polymorphism;

/**
 * Created by BOLOFBABA on 4/15/2017.
 */
public class Main {

    public static void main(String [] args)
    {
        Movie movie = new Movie("FFS",2017,3);

        GetOut getout = new GetOut("getout",2017,3,"race");

        //getout.actedLocation();
       // movie.actedLocation();

        FastAndFurious ffs = new FastAndFurious("FFS",2017,4);
        System.out.println("ffs" + ffs.actedLocation());

        StarWars star = new StarWars("starwars",2017,3);

        System.out.println("Star wars" + star.actedLocation());

        System.out.println("getout" + getout.actedLocation());

    }
}
