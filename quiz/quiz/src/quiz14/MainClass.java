package quiz14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
        /*
        업다운 게임
        1~100까지 랜덤한 정답을 만들고, 사용자에게 정답을 맞출 때까지 입력받는 프로그램입니다.

        한글을 입력하더라도 정상적으로 돌아갈 수 있도록 예외처리 진행합니다.

        한글을 입력하면 무한루프를 돌게 되는데 그 해결방법 찾기
         */

        Scanner sc = new Scanner(System.in);
        int correct = (int)(Math.random()*100)+1;
        int count = 0;


        while (true) {

            System.out.print("1~100중 정답 입력: ");

            try {
                int a = sc.nextInt();
                count++;

                if (a == correct) {
                    System.out.println("정답입니다");
                    System.out.println("시도횟수: " + count);
                    break;
                } else if (a > correct) {
                    System.out.println("정답보다 큰 수 입니다");
                } else {
                    System.out.println("정답보다 작은 수 입니다");
                }

            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요");
                sc.nextLine(); //next() nextLine() 엔터키코드를 포함해서 입력 받아줌
            }
        }
        
    }
}
