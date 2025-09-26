package quiz08;

public class MainClass {
    public static void main(String[] args) {

        Phone phone = new Phone("123123", "휴대폰");

        Person person = new Person("홍길동", phone);

        person.getPersonInfo();

    }
}
