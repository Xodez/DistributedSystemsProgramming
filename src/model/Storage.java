package model;

import model.bombs.Shell;
import model.ships.Ship;

public class Storage {
    private Ship ship;
    private Shell shell;


    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Shell getShell() {
        return shell;
    }

    public void setShell(Shell shell) {
        this.shell = shell;
    }

    @Override
    public String toString() {
        return ship.getType() + " spotted in " + ship.getLocation() + ", " + shell.getType() + " produced.";
    }
}
