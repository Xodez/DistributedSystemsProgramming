package model.bombs;

public abstract class Shell {
    public String type;

    public String getType() {
        return type;
    }

    abstract void setType();
}
