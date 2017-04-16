package Encapsulation;

/**
 * Created by BOLOFBABA on 4/14/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinted;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinted)
    {
        if(tonerLevel >-1 && tonerLevel <=100)
        {
            this.tonerLevel = tonerLevel;

        }
        else
        {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplexPrinted = duplexPrinted;

    }

    public int addToner(int tonerAmount)
    {
        if(this.tonerLevel> 0 && this.tonerLevel <=100)
        {
            if(this.tonerLevel+ tonerAmount >100)
            {
                return -1;
            }
        }
        else
        {
            this.tonerLevel += tonerAmount;


        }

        return this.tonerLevel;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinted() {
        return duplexPrinted;
    }
}

