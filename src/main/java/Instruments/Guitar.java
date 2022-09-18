package Instruments;

public class Guitar extends Instrument {
    private int strings;


    public Guitar(String material, String type, int strings) {
        super(material, type);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }
}
