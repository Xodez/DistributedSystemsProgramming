package controller;

import javafx.beans.Observable;
import model.Blarney;
import model.Kinsale;
import model.Youghal;

public class Controller {

    // Creates the three sites
    Kinsale kinsale = new Kinsale();
    Youghal youghal = new Youghal();
    Blarney blarney = new Blarney();

    // Creates threads of the three sites
    Thread tYoughal = new Thread(youghal);
    Thread tKinsale = new Thread(kinsale);
    Thread tBlarney = new Thread(blarney);

    public void makeShip(String thread, String ship) {
        if (thread.equalsIgnoreCase("KINSALE")) {
            kinsale.createShip(ship);
        }
        else if (thread.equalsIgnoreCase("YOUGHAL")) {
            youghal.createShip(ship);
        }
    }

    public void startThreads(){
        kinsale.addObserver(blarney);
        tKinsale.start();
        tBlarney.start();
    }

    public Kinsale kinsale(){
        return kinsale;
    }

}
