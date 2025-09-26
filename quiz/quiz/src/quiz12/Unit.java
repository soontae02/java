package quiz12;

public abstract class Unit {

    int x = 0;
    int y = 0;
    int hp = 60;

    public Unit(int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
    }

    public abstract void location();

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void stop() {
        this.x = 0;
        this.y = 0;
    }


}
