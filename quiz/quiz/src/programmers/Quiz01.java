package programmers;
//문자 반복 출력하기


public class Quiz01 {
    public String solution(String my_string, int n) {

        String p = "";

        for ( int i = 0; i < my_string.length(); i++ ) {

            char c = my_string.charAt(i);

            for ( int j = 0; j < n; j++ ) {

                p += c;

            }

        }

        return p;
    }
}
