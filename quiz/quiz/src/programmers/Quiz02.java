package programmers;
//양꼬치

public class Quiz02 {
    public int solution(int n, int k) {

        int result = 0;

        if (n >= 10) {
            result = n * 12000 + k * 2000 -(n/10 * 2000);
        } else {
            result = n * 12000 + k * 2000;
        }

        return result;
    }
}

