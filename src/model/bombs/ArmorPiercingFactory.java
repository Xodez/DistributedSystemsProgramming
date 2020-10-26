package model.bombs;

public class ArmorPiercingFactory implements ShellFactory{
    @Override
    public Shell produceShell(String Type) {
        return new ShellArmorPiercing();
    }
}
