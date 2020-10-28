package model.bombs;

public class BlastBombFactory implements ShellFactory{
    @Override
    public Shell produceShell() {
        ShellBlastBomb temp = new ShellBlastBomb();
        temp.setType();
        return temp;
    }
}
