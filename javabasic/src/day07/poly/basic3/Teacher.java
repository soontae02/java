package day07.poly.basic3;

public class Teacher extends Person {

    String subject; //선생의 고유기능

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override //어노테이션 - 오버라이딩 됐음
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
    }
}

