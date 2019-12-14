public class PetrolVehicle {

    private double value;

    public PetrolVehicle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
