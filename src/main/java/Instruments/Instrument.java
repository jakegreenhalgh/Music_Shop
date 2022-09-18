package Instruments;

public abstract class Instrument {
    protected String material;
    protected String type;

    public Instrument(String material, String type) {
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}
