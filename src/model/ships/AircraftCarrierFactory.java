package model.ships;

public class AircraftCarrierFactory implements ShipFactory{
    @Override
    public Ship produceShip(String location) {
        ShipAircraftCarrier temp = new ShipAircraftCarrier();
        temp.setType();
        temp.setLocation(location);
        return temp;
    }
}
