package model.ships;

public class AircraftCarrierFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        return new ShipAircraftCarrier();
    }
}
