package domain;

public class Movie extends Product {

    public Movie(String id, String titel) {
        super(id, titel);
    }

    @Override
    public double getPrice(int days) {
        return 5 + (days*2);
    }
}
