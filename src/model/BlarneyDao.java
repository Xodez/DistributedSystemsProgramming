package model;

import java.util.ArrayList;

public interface BlarneyDao {
    abstract ArrayList<Storage> getAllProduced();
    abstract void addProduction(ArrayList<Storage> production, Storage storage);
}
