package model;

import model.ships.Ship;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("Deprecated")
public class Blarney implements Observer, Runnable {

    ArrayList<Ship> fleet = new ArrayList<>();

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("BLARNEY UPDATED");
        fleet.add((Ship) arg);
        System.out.println(((Ship) arg).getType() + " " + ((Ship) arg).getLocation());
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                if (fleet.size() < 10) {
                    System.out.println("THERE IS NO FLEET IN BLARNEY");
                } else {
                    System.out.println("FLEET IN BLARNEY SPOTTED");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}