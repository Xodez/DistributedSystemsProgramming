package model.ships;

public class SailingFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        ShipSailing temp = new ShipSailing();
        temp.setType();
        return temp;
    }
}
