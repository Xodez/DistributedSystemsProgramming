package model.bombs;

public class TorpedoFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        ShellTorpedo temp = new ShellTorpedo();
        temp.setType();
        return new ShellTorpedo();
    }
}
