package Composition;

/**
 * Created by BOLOFBABA on 4/14/2017.
 */
public class Main{

    public static void main(String[] args)
    {
        Dimension dimension = new Dimension(20,50,5);
        Case thecase = new Case("37740","DELL","240",dimension);
        Monitor theMonitor = new Monitor("900m","DELL",20,new Resolution(20,40));
        Motherboard theMotherboard = new Motherboard("intel","INTEL2","16gb",4,"dello");

        PC thePC = new PC(thecase,theMonitor,theMotherboard);
        thePC.getThemonitor().drawPixel(10,10,"Blue");
        //thePC.getThemotherboard().loadProgram("NowOpen");
        //thePC.getThecase().getDimention().getDepth();


    }
}
