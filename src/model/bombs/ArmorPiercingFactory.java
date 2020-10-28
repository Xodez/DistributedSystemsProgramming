package model.bombs;

public class ArmorPiercingFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        ShellArmorPiercing temp = new ShellArmorPiercing();
        temp.setType();
        return new ShellArmorPiercing();
    }
}
