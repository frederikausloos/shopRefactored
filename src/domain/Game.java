package domain;

public class Game extends Product{

    public Game(String id, String titel) {
        super(id, titel);
    }

    @Override
    public double getPrice(int days) {
        return days *3 ;
    }
}
