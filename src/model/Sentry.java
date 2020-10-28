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
            System.out.println("Thread is running");
            Thread.sleep(2000);
            System.out.println(this.createdShip + " " + createdShip);
            if (createdShip != null) {
                System.out.println("SHIPS IN FLEET");

                System.out.println(createdShip.getLocation());

                this.setChanged();
                this.notifyObservers(createdShip);
                createdShip = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
