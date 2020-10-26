package model.bombs;

public class BlastBombFactory implements ShellFactory{
    @Override
    public Shell produceShell(String Type) {
        return new ShellBlastBomb();
    }
}
