package Quiz09;
//알파벳 찾기

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S =  sc.nextLine();

        for (char i = 'a'; i <= 'z'; i++) {

            int index = S.indexOf(i);

            System.out.print(index + " ");
            //baekjoon
            //1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        }

    }
}
