package model.bombs;

public class TorpedoFactory implements ShellFactory{
    @Override
    public Shell produceShell(String Type) {
        return new ShellTorpedo();
    }
}