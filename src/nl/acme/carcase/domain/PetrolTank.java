package nl.acme.carcase.domain;

public class PetrolTank {
    private double maxLevel=10, minLevel=0, currentLevel=6;

    public void dec() {
        this.currentLevel--;
    }

    public double getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(double maxLevel) {
        this.maxLevel = maxLevel;
    }

    public double getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(double minLevel) {
        this.minLevel = minLevel;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }
}
