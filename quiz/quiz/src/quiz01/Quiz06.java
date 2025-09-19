package quiz01;
//공 바꾸기
import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = input.nextInt();
            int j = input.nextInt();

            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
