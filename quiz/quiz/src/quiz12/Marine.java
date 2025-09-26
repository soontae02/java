package quiz12;

public class Marine extends Unit {

    public final static int attack = 6;
    public final static int armor = 0;

    public Marine(int x, int y, int hp) {
        super(x, y, hp);
    }

    @Override
    public void location() {
        System.out.println("마린 현재 위치: " + this.x + "," + this.y);
    }
}
