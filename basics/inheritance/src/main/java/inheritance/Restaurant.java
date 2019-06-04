package inheritance;

public class Restaurant {

    private String name;
    private double numStars;
    private String dollarSign;

    public Restaurant() {}

    public Restaurant(String name, double numStars, String dollarSign) {
        this.name = name;
        this.numStars = numStars;
        this.dollarSign = dollarSign;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public double getNumStars() {
        return numStars;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return String.format("The restaurant %n has %r and has a price range of %p", this.name,
                this.numStars, this.dollarSign);
    }
}
