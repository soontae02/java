package quiz12;

public class DropShip extends Unit {

    public DropShip(int x, int y, int hp) {
        super(x, y, hp);
    }

    @Override
    public void location() {
        System.out.println("드롭쉽 현재 위치: " + this.x + "," + this.y);
    }

}
