package domain;

public abstract class Product {
    private String id, titel;

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

    public abstract double getPrice (int days);
}
