package model.ships;

public class DestroyerFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        return new ShipDestroyer();
    }
}
