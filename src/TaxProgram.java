public class TaxProgram {

    static DieselVehicle dieselVehicle = new DieselVehicle(15000);
    static PetrolVehicle petrolVehicle = new PetrolVehicle(15000);

    public static void main(String[] args) {
        System.out.println("Tax Rates for Vehicles");
        System.out.println("Diesel tax is " + dieselVehicle.accept(new TaxVisitor()));
        System.out.println("Petrol tax is " + petrolVehicle.accept(new TaxVisitor()));
    }

}
