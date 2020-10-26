package model;

import model.ships.AircraftCarrierFactory;
import model.ships.DestroyerFactory;
import model.ships.SailingFactory;
import model.ships.Ship;

import java.util.ArrayList;
import java.util.Observable;

public class Youghal extends Observable implements Runnable {

    AircraftCarrierFactory acf = new AircraftCarrierFactory();
    DestroyerFactory df = new DestroyerFactory();
    SailingFactory sf = new SailingFactory();
    Ship createdShip;

    public Ship createShip(String ship) {
        if (ship.equalsIgnoreCase("AIRCRAFT CARRIER")) {
            createdShip = acf.produceShip();
        } else if (ship.equalsIgnoreCase("DESTROYER")) {
            createdShip = df.produceShip();
        } else if (ship.equalsIgnoreCase("SAILING SHIP")) {
            createdShip = sf.produceShip();
        }
        else{
            return null;
        }
        createdShip.setLocation("Youghal");
        return createdShip;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                if (createdShip != null) {
                    System.out.println("SHIPS IN FLEET");

                    System.out.println(createdShip.getLocation());

                    this.setChanged();
                    this.notifyObservers(createdShip);
                    createdShip = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}