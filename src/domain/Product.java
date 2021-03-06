package domain;

public abstract class Product {
    private String id, titel;
    protected PriceStrategy priceStrategy;

    public Product(String id, String titel) {
        this.id = id;
        this.titel = titel;
    }

    public String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double getPrice (int days){
        return priceStrategy.getPrice(days);
    }
}
