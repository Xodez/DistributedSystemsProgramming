package model;

import model.ships.Ship;

import java.lang.reflect.Type;
import java.util.*;

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
                Thread.sleep(10000);
                if (fleet.isEmpty()){
                    System.out.println("THERE IS NO FLEET IN BLARNEY");
                }
                else if (fleet.size() == 10){
                    System.out.println("FLEET IN BLARNEY SPOTTED");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test(ArrayList<Ship> s){
        System.out.println(s.get(1).getType() + " ~~~~~IT WORKS?~~~~~");
    }
}