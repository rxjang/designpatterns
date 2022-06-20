package decorator.old;

public class Beverage {

    private String description;

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    private boolean wip;

    private double milkCost = 1;

    private double soyCost = 1.5;


    public double cost() {

        double cost = 0;

        cost += hasMilk() ? milkCost : 0;

        cost += hasSoy() ? soyCost : 0;

        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWip() {
        return wip;
    }

    public void setWip(boolean wip) {
        this.wip = wip;
    }
}
