package model;

import model.ships.Ship;

@SuppressWarnings("Deprecated")
public class Kinsale extends Sentry {
    @Override
    public Ship createShip(String ship) {
        if (ship.equalsIgnoreCase("AIRCRAFT CARRIER")) {
            createdShip = acf.produceShip();
        } else if (ship.equalsIgnoreCase("DESTROYER")) {
            createdShip = df.produceShip();
        } else if (ship.equalsIgnoreCase("SAILING SHIP")) {
            createdShip = sf.produceShip();
        } else {
            return null;
        }
        createdShip.setLocation("Kinsale");
        return createdShip;
    }

}
