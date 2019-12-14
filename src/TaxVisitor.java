public class TaxVisitor implements Visitor {

    public TaxVisitor() {

    }

    @Override
    public double visit(PetrolVehicle petrolVehicle) {
        return petrolVehicle.getValue()*0.2;
    }

    @Override
    public double visit(DieselVehicle dieselVehicle) {
        return dieselVehicle.getValue()*0.4;
    }
}
