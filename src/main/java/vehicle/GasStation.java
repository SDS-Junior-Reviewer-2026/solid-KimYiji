package vehicle;

public class GasStation {

    public void reFuel(Vehicle vehicle) {    // 외부 주유소의 책임.
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
    public void setFuel(Vehicle vehicle, int fuel) {
        vehicle.setRemainingFuel(fuel);
    }
    public void addFuel(Vehicle vehicle, int moreFuel) {
        vehicle.setRemainingFuel(vehicle.getRemainingFuel() + moreFuel);
    }
}
