package nl.acme.carcase.domain;

public class Car {

    private int mileage;
    private int speed;
    private double price;
    private String licencePlate;

    PetrolTank tanky = new PetrolTank();

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + String.valueOf(speed) +
                ", price=" + String.valueOf(price) +
                ", licencePlate='" + licencePlate + '\'' +
                '}';
    }

    public Car(String plate) {
        this.licencePlate = plate;
    }

    public Car(String plate, double price) {
        this.licencePlate = plate;
        this.price = price;
    }

    public void fill() {
        if(tanky.getCurrentLevel() < tanky.getMaxLevel()) {
            tanky.setCurrentLevel(tanky.getCurrentLevel() + 1);
            System.out.println("Fuel @ "+tanky.getCurrentLevel()+"\\"+tanky.getMaxLevel());
        } else {
            System.out.println("Tank is al vol!");
        }
    }
    public void fill(int liters) {
        if(tanky.getCurrentLevel() < tanky.getMaxLevel()) {
            tanky.setCurrentLevel(tanky.getCurrentLevel()+liters);
            if(tanky.getCurrentLevel() > tanky.getMaxLevel()) {
                System.out.println("You just wasted "+String.valueOf(tanky.getCurrentLevel()-tanky.getMaxLevel())+" liters!");
                tanky.setCurrentLevel(tanky.getMaxLevel());
                System.out.println("Tank is at maximum level :"+ tanky.getCurrentLevel());
            }
        } else {
            System.out.println("Tank is al vol!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
