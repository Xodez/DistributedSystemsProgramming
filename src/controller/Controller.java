package controller;

import model.Blarney;
import model.Kinsale;
import model.Sentry;
import model.Youghal;

public class Controller {

    // Creates the three sites
    Kinsale kinsale = new Kinsale();
    Youghal youghal = new Youghal();
    Blarney blarney = new Blarney();

    public void makeShip(String thread, String ship) {
        if (thread.equalsIgnoreCase("KINSALE")) {
            this.kinsale.createShip(ship);
        } else if (thread.equalsIgnoreCase("YOUGHAL")) {
            this.youghal.createShip(ship);
        }
    }

    public void addObservers() {
        this.kinsale.addObserver(blarney);
        this.youghal.addObserver(blarney);
    }

    public Sentry getSentry(String sentry) {
        if (sentry.equalsIgnoreCase("KINSALE")) {
            return this.kinsale;
        } else if (sentry.equalsIgnoreCase("YOUGHAL")) {
            return this.youghal;
        }
        else{
            return null;
        }
    }

    public Blarney getBlarney() {
        return blarney;
    }
}
