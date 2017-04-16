package Polymorphism;

/**
 * Created by BOLOFBABA on 4/15/2017.
 */
public class Movie
{
    private String name;
    private int year;
    private int length;

    public Movie(String name,int year,int length)
    {
        this.name = name;
        this.year = year;
        this.length = length;
    }

    public String  actedLocation()
    {
        return " Acted in main class";
    }


}

class FastAndFurious extends Movie
{
    public FastAndFurious(String name, int year, int length) {
        super("Fast and Furious", 2017, 3);
    }


    public String actedLocation()
    {
        return "Acted in ffs class";
    }
}

class GetOut extends Movie
{
    private String racial;

    public GetOut(String name, int year, int length, String racial)
    {
        super(name, year, length);
        this.racial = racial;
    }

    public String actedLocation()
    {
        return "Acted in getout class";
    }
}

class StarWars extends Movie
{
    public StarWars(String name,int year,int length)
    {
        super(name,year,length);

    }
    // no method is defined

}





