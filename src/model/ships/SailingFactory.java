package model.ships;

public class SailingFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        return new ShipSailing();
    }
}
