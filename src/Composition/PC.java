package Composition;

/**
 * Created by BOLOFBABA on 4/12/2017.
 */
public class PC {

    private Case thecase;
    private Monitor themonitor;
    private Motherboard themotherboard;

    public PC(Case thecase, Monitor themonitor, Motherboard themotherboard) {
        this.thecase = thecase;
        this.themonitor = themonitor;
        this.themotherboard = themotherboard;
    }

    public Case getThecase() {
        return thecase;
    }

    public Monitor getThemonitor() {
        return themonitor;
    }

    public Motherboard getThemotherboard() {
        return themotherboard;
    }
}

