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
    ArrayList<Ship> fleet = new ArrayList<>();

    public void createShip(String ship){
        if(ship.equalsIgnoreCase("AIRCRAFT CARRIER")) {
            fleet.add(acf.produceShip());
        }
        else if(ship.equalsIgnoreCase("DESTROYER")){
            fleet.add(df.produceShip());
        }
        else if(ship.equalsIgnoreCase("SAILING SHIP")) {
            fleet.add(sf.produceShip());
        }
    }

    @Override
    public void run() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}