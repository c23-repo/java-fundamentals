package inheritance;

public class Review {
    private String author;
    private String body;
    private double numStars;


    public Review(String author, String body, double numStars) {
        this.author = author;
        this.body = body;

        if (numStars < 0) numStars = 0;
        if (numStars > 5) numStars = 5;
        this.numStars = numStars;
    }


    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public double getNumStars() {
        return this.numStars;
    }

    public String toString(){
        return String.format("%.1f out of 5 stars \n%s \nWritten by %s", this.getNumStars(),
                this.getBody(), this.getAuthor());
    }



}

