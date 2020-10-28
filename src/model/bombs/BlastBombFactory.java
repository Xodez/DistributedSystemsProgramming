package model.bombs;

public class BlastBombFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        return new ShellBlastBomb();
    }
}
