package model.ships;

public class DestroyerFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        ShipDestroyer temp = new ShipDestroyer();
        temp.setType();
        return temp;
    }
}
