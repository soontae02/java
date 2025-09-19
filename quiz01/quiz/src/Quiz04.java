import java.util.Scanner;

public class Quiz04  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 정수의 개수 N 입력
        int n = sc.nextInt();

        // 2. 첫 번째 정수를 입력받아 초기 최솟값과 최댓값으로 설정
        int min = sc.nextInt();
        int max = min;

        // 3. 두 번째 정수부터 N개까지 반복하며 비교
        for (int i = 1; i < n; i++) {
            int number = sc.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
