package model;

@SuppressWarnings("Deprecated")
public class Youghal extends Sentry {

    @Override
    public void createShip(String ship) {
        if (ship.equalsIgnoreCase("AIRCRAFT CARRIER")) {
            createdShip = acf.produceShip("Youghal");
        } else if (ship.equalsIgnoreCase("DESTROYER")) {
            createdShip = df.produceShip("Youghal");
        } else if (ship.equalsIgnoreCase("SAILING SHIP")) {
            createdShip = sf.produceShip("Youghal");
        }
    }
}
