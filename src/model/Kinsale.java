package model;

@SuppressWarnings("Deprecated")
public class Kinsale extends Sentry {

    @Override
    public void createShip(String ship) {
        if (ship.equalsIgnoreCase("AIRCRAFT CARRIER")) {
            createdShip = acf.produceShip("Kinsale");
        } else if (ship.equalsIgnoreCase("DESTROYER")) {
            createdShip = df.produceShip("Kinsale");
        } else if (ship.equalsIgnoreCase("SAILING SHIP")) {
            createdShip = sf.produceShip("Kinsale");
        }
    }
}
