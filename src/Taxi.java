public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public double getFareCollected() {
    return fareCollected;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fare Collected: " + fareCollected);
  }

  public boolean chargeAndDropOffRiders(double farePerRider) {
    fareCollected += (getPassengers() - 1) * farePerRider; // charge riders
    return dropOffPassengers(getPassengers() - 1); // drop off
  }

}