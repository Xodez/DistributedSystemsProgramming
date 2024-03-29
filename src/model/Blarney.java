package model;

import model.bombs.ArmorPiercingFactory;
import model.bombs.BlastBombFactory;
import model.bombs.Shell;
import model.bombs.TorpedoFactory;
import model.ships.Ship;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("Deprecated")
public class Blarney implements Observer, Runnable, BlarneyDao {

    ArrayList<Ship> fleet = new ArrayList<>();
    ArrayList<Storage> production = new ArrayList<>();
    ArmorPiercingFactory apf = new ArmorPiercingFactory();
    BlastBombFactory bbf = new BlastBombFactory();
    TorpedoFactory tf = new TorpedoFactory();

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("BLARNEY UPDATED\n");
        fleet.add((Ship) arg);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                if (fleet.size() != 0) {
                    Ship shipTemp = fleet.get(fleet.size() - 1);
                    fleet.remove(fleet.size() - 1);
                    Shell shellTemp = createShell(shipTemp);
                    Storage storageTemp = new Storage();
                    storageTemp.setShip(shipTemp);
                    storageTemp.setShell(shellTemp);
                    production.add(storageTemp);
                    int i = 1;
                    System.out.println("Adding to records: " + " " +storageTemp.toString() + "\n");
                    for (Storage storage : production) {
                        System.out.println(i + ": " + storage.toString());
                        i += 1;
                    }
                    System.out.println("\n");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Storage> getAllProduced() {
        return production;
    }

    @Override
    public void addProduction(ArrayList<Storage> production, Storage storage) {
        production.add(storage);
    }

    public Shell createShell(Ship ship){
        if (ship.getType().equalsIgnoreCase("AIRCRAFT CARRIER")) {
            return tf.produceShell();
        } else if (ship.getType().equalsIgnoreCase("DESTROYER")) {
            return apf.produceShell();
        } else if (ship.getType().equalsIgnoreCase("SAILING SHIP")) {
            return bbf.produceShell();
        }else{
            return null;
        }
    }
}