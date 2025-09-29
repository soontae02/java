package day07.encap.bad;

public class MainClass {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        myDate.year = 2020;
        myDate.month = 1;
        myDate.day = 1;
        //의도치 않은 값이 저장될 수 있음...

    }
}
