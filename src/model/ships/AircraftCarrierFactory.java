package model.ships;

public class AircraftCarrierFactory implements ShipFactory{
    @Override
    public Ship produceShip() {
        ShipAircraftCarrier temp = new ShipAircraftCarrier();
        temp.setType();
        return temp;
    }
}
