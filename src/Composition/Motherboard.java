package Composition;

/**
 * Created by BOLOFBABA on 4/11/2017.
 *
 * Using composition to build a PC
 *
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private String rmSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, String rmSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.rmSlots = rmSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("program"+ programName+ "is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRmSlots() {
        return rmSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
