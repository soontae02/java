package day07.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();

        myDate.setYear(2025);
        int year = myDate.getYear();

        myDate.setMonth(9);
        int month = myDate.getMonth();

        myDate.setDay(14);
        int day = myDate.getDay();

        System.out.println("당신의 생일은: " + year + "-" + month + "-" + day);

    }
}
