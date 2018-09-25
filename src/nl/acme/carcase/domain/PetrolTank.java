package nl.acme.carcase.domain;

public class PetrolTank {
    private double maxLevel, minLevel, currentLevel;

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
