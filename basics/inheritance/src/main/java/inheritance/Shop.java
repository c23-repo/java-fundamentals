package inheritance;

import java.util.ArrayList;

public class Shop {

    private String name;
    private String description;
    private String dollarSign;
    private final ArrayList<Review> reviews;

    public Shop(String name, String description, String dollarSign){
        this.name = name;
        this.description = description;
        this.dollarSign = dollarSign;

        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDollarSign() {
        return this.dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }

    public String toString(){
        return String.format("");
    }
}
