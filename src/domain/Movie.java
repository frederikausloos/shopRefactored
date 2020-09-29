package domain;

public class Movie extends Product {

    public Movie(String id, String titel) {
        super(id, titel);
        priceStrategy = new PriceStrategyMovie();
    }

}
