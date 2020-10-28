package model.ships;

public class DestroyerFactory implements ShipFactory{
    @Override
    public Ship produceShip(String location) {
        ShipDestroyer temp = new ShipDestroyer();
        temp.setType();
        temp.setLocation(location);
        return temp;
    }
}
