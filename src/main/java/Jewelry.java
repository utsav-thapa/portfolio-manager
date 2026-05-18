public class Jewelry extends FixedAsset {
    private double karats;

    public Jewelry(String name, double value) {
        super(name, value);

    }
    @Override
    public double getValue() {
        return 0;
    }
}
