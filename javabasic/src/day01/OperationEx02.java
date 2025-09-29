package day1;

public class OperationEx02 {
    public static void main(String[] args) {
        int i = 10 / 3;
        System.out.println(i); //3
        System.out.println(10 % 3); //1
        System.out.println(1 * 10); //20

        //비트연산자
        int a = 192;
        System.out.println(a << 3);
        System.out.println(a >> 3);

        //대입연산자 +=, -=, /+
        int num = 1;
        //num = num + 3;
        num += 3; //4;
        num -= 1; //4;
        num *= 10; //30;
        num /= 2; //15;
        num %= 2; //1;

        System.out.println(num);

        System.out.println("----------------------------------------");
        //논리연산자
        //&, | 한개짜리는 무조건 뒤에 코드를 실행
        //&&, || 두개짜리는 만족하지 않는 조건이라면, 뒤에는 실행하지 않음
        int x = 10;
        int y = 20;
        System.out.println( x != 10 && ++y == 21 );
        System.out.println("x:" + x + " y:" + y);
        System.out.println( x == 10 || ++y == 21 );
        System.out.println("x:" + x + " y:" + y);
    }
}
