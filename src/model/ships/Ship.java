package model.ships;

public abstract class Ship {
    public String type;
    public String location;

    public String getType() {
        return type;
    }

    public void setLocation(String s) {
        location = s;
    }

    public String getLocation(){
        return location;
    }

    abstract void setType();
}
