package quiz15;
//문자열
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.length() == 0) {
                continue;
            }

            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);

            System.out.println("" + first + last);
        }

        sc.close();
    }
}