package inheritance;

import java.util.ArrayList;

public class Theater {

    private String name;
    private String moviesShowing;
    private final ArrayList<Review> reviews;

    public Theater(String name, String moviesShowing) {
        this.name = name;
        this.moviesShowing = moviesShowing;

        this.reviews = new ArrayList<>();
    }
}
