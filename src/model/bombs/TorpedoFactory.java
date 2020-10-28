package model.bombs;

public class TorpedoFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        return new ShellTorpedo();
    }
}
