package quiz12;

public class Tank extends Unit {

    public Tank(int x, int y, int hp) {
        super(x, y, hp);
    }

    @Override
    public void location() {
        System.out.println("탱크 현재 위치: " + this.x + "," + this.y);
    }

}
