package quiz06;

public class MainClass {
    public static void main(String[] args) {
        SuperSonicAp air = new SuperSonicAp("행기");

        System.out.println(air.info());
        air.fly();

        System.out.println("고속모드 전환");
        air.flyMode = 1;
        System.out.println(air.info());
        air.fly();

    }
}
