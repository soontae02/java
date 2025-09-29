package day09.exception.throw_;

public class ThrowEx01 {

    public static void main(String[] args) {

    }

    public static int calc(int a) {
        
        if(a < 0) {

            //try~catch문장이나 throws구문으로 반드시 예외를 처리해야합니다.

            try {
                calc(-10);
            } catch (Exception e) {
                System.out.println("예외 발생");
            }

        }
        
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return a;

    }

}
