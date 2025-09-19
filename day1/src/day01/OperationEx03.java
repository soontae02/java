package day1;

public class OperationEx03 {
    public static void main(String[] args) {

        double d = Math.random(); //0~1미만 랜덤수
        int ran = (int)(d * 10) + 1; //1~11미만

        System.out.println("랜덤수: " + ran);
        String result = ran >= 5 ? "5이상" : "5이하";
        System.out.println(result);

        //1~100까지 랜덤한 정수를 하나 만들고 랜덤수가 짝수인지 홀수인지 출력하세요.
        int ran1 = (int)(d * 100) + 1;

        System.out.println("랜덤수: " + ran1);
        String result1 = ran1 % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result1);
    }
}
