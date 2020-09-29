package domain;

public class Game extends Product{

    public Game(String id, String titel) {
        super(id, titel);
        priceStrategy = new PriceStrategyGame();
    }


}
