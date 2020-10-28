package model.ships;

public class SailingFactory implements ShipFactory{
    @Override
    public Ship produceShip(String location) {
        ShipSailing temp = new ShipSailing();
        temp.setType();
        temp.setLocation(location);
        return temp;
    }
}
