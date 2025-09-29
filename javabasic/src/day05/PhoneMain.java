package day05;

public class PhoneMain {
    public static void main(String[] args) {
        //new키워드 다음에 오는게 생성자입니다.
        Phone phone = new Phone();
        phone.info();

        Phone red = new Phone("레드");
        red.info();

        Phone blue = new Phone("파랑", 10000);
        blue.info();

        //model, color, price를 받는 생성자를 만들고
        //각 초기값을 지정하고, 객체생성을 해서 확인.
        Phone green = new Phone("아이폰", "초록", 12000 );
        green.info();
    }
}
