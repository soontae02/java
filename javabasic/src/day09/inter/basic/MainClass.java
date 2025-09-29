package day09.inter.basic;

public class MainClass {
    public static void main(String[] args) {

        Basic basic = new Basic();
        basic.method1();
        basic.method2();

        //인터페이스는 부모타입이 될 수 있습니다!!
        Inter1 inter1 = new Basic();
        inter1.method1();

        Inter2 inter2 = new Basic();
        inter2.method2();

        //인터페이스도 형변환이 가능합니다.
        Basic b1 = (Basic) inter1;
        Basic b2 = (Basic) inter2;

    }
}
