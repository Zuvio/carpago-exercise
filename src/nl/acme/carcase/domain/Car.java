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
            System.out.println("Fuel @ "+tanky.getCurrentLevel()+"\\"+tanky.getMaxLevel());
            if(tanky.getCurrentLevel() > tanky.getMaxLevel()) {
                System.out.println("You just wasted "+String.valueOf(tanky.getCurrentLevel()-tanky.getMaxLevel())+" liters!");
                tanky.setCurrentLevel(tanky.getMaxLevel());
                System.out.println("Tank is at maximum level :"+ tanky.getCurrentLevel());
            }
        } else {
            System.out.println("Tank is al vol!");
        }
    }

    public void drive() {
        if(tanky.getCurrentLevel()>0) {
            tanky.setCurrentLevel(tanky.getCurrentLevel()-1);
            System.out.println("1km gereden -> fuel @ "+tanky.getCurrentLevel()+"\\"+tanky.getMaxLevel());
        } else {
            System.out.println("ERROR: Je kunt niet rijden, want je tank is leeg, succes lol...  (Tip: roep fill() aan....)");
        }
    }
    public void drive(int kms) {
        if(tanky.getCurrentLevel()>0) {
            tanky.setCurrentLevel(tanky.getCurrentLevel()-kms);
            if(tanky.getCurrentLevel()<tanky.getMinLevel()) {
                System.out.println("Je hebt je tank leeg gereden, eerst weervullen aub.");
                tanky.setCurrentLevel(tanky.getMinLevel());
            } else {
                System.out.println(kms+"km gereden -> fuel @ "+tanky.getCurrentLevel()+"\\"+tanky.getMaxLevel());
            }

        } else {
            System.out.println("ERROR: Je kunt niet rijden, want je tank is leeg, succes lol...  (Tip: roep fill() aan....)");
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
