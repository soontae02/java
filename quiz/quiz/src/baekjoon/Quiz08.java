package baekjoon;
//문자열 반복

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int R = sc.nextInt();
            String S =  sc.nextLine();
            String P = "";

            for (int j = 1; j <= S.length(); j++) {

                char c = sc.next().charAt(0);

                for  (int k = 1; k <= R; k++) {
                    P += c;
                }
            }

            System.out.println(P);

        }

        sc.close();

    }
}
