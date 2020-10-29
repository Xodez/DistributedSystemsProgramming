package model;

import model.ships.AircraftCarrierFactory;
import model.ships.DestroyerFactory;
import model.ships.SailingFactory;
import model.ships.Ship;

import java.util.Observable;

@SuppressWarnings("Deprecated")
public abstract class Sentry extends Observable implements Runnable {
    AircraftCarrierFactory acf = new AircraftCarrierFactory();
    DestroyerFactory df = new DestroyerFactory();
    SailingFactory sf = new SailingFactory();
    Ship createdShip;

    public abstract void createShip(String ship);

    @Override
    public void run() {
        try {
            Ship tempShip = createdShip;
            Thread.sleep(2000);
            if (tempShip != null) {
                System.out.println("Ship spotted in" + " " + tempShip.getLocation() + "!\n");
                this.setChanged();
                this.notifyObservers(tempShip);
                createdShip = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
