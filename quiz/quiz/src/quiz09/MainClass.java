package quiz09;

public class MainClass {
    public static void main(String[] args) {

        Market market = new Market();

        Radio r1 = new Radio("라디오1", 100000);
        Radio r2 = new Radio("라디오2", 100000);
        Radio r3 = new Radio("라디오3", 100000);

        Radio t1 = new Radio("TV1", 200000);
        Radio t2 = new Radio("TV2", 200000);

        market.barcode(null);

        market.printAll();

    }
}
