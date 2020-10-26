package controller;

import model.Blarney;
import model.Kinsale;
import model.Youghal;

@Deprecated
public class Controller {

    public void StartThreads() {

        // Creates the three sites
        Kinsale kinsale = new Kinsale();
        Youghal youghal = new Youghal();
        Blarney blarney = new Blarney();

        // Adds blarney as an observer to Model.Kinsale and Model.Youghal
        kinsale.addObserver(blarney);
        youghal.addObserver(blarney);

        // Creates threads of the three sites
        Thread tYoughal = new Thread(youghal);
        Thread tKinsale = new Thread(kinsale);
        Thread tBlarney = new Thread(blarney);

    }

    public void setSceneKinsale(){

    }

    public void setSceneYoughal(){

    }

}
