package day02;

public class WhileEx {
    public static void main(String[] args) {

        int cnt = 0;

        //1~10까지 수 중에 짝수의 개수
        int i = 1; //제어변수
        while(i <= 10) { //조건식

            if (i % 2 == 0) {
                cnt++; //개수
            }

            i++; //증감식
        }

        System.out.println("10까지 짝수의 개수:" + cnt);
        
    }
}
