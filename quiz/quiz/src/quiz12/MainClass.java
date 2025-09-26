package quiz12;

public class MainClass {
    public static void main(String[] args) {

        Unit marine = new Marine(5, 5, 60);
        marine.location();
        marine.move(10, 10);
        marine.location();

        System.out.println("마린 공격력: " + Marine.attack);
        System.out.println("마린 방어력: " + Marine.armor);

        System.out.println("--------------------");

        Unit tank = new Tank(100, 200, 150);
        tank.location();
        tank.move(50, 50);
        tank.location();
        tank.stop();
        tank.location();

        System.out.println("--------------------");

        Unit dropShip = new DropShip(500, 500, 250);
        dropShip.location();
        dropShip.move(10, 500);
        dropShip.location();
        dropShip.stop();
        dropShip.location();

    }
}
