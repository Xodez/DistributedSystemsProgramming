package model.ships;

public abstract class Ship {
    public String type;

    public String getType() {
        return type;
    }

    abstract void setType();
}
