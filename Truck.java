class Truck extends Vehicle {
    private double milesDriven;
    private double fuelConsumed; // w galonach
    private double cargoWeight; // w tonach

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        if (fuelConsumed == 0) {
            return 0; // zabezpieczenie przed dzieleniem przez zero
        }
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
