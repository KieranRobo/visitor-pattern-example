public class DieselVehicle {

    private double value;

    public DieselVehicle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
