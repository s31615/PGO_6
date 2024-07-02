class Car extends Vehicle {
    private double milesDriven;
    private double fuelConsumed; // w galonach

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        if (fuelConsumed == 0) {
            return 0; // zabezpieczenie przed dzieleniem przez zero
        }
        return milesDriven / fuelConsumed;
    }
}
