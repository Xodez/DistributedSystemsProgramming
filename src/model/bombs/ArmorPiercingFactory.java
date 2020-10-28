package model.bombs;

public class ArmorPiercingFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        return new ShellArmorPiercing();
    }
}
