package inheritance;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private double numStars;
    private String dollarSign;
    private final ArrayList<Review> reviews;

    public Restaurant(String name, String dollarSign) {
        this.name = name;
        this.numStars = 0.0;
        this.dollarSign = dollarSign;

        this.reviews = new ArrayList<>();
    }

    public String getDollarSign() {
        return this.dollarSign;
    }

    public double getNumStars() {
        return this.numStars;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return String.format("The restaurant %s has %.1f and has a price range of %s", this.getName(),
                this.getNumStars(), this.getDollarSign());
    }

    private double avgStars(){
        int sum = 0;

        for (Review oneReview :
                this.reviews) {
            sum += oneReview.getNumStars();
        }
        if (sum == 0) return 0;
        return (double) sum / this.reviews.size();
    }

    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.numStars = this.avgStars();
        }

    }
}
