package api.io.buffered;

import java.io.*;

public class 빠른입출력 {
    public static void main(String[] args) {

        //입출력
        try {

            //빠른입력
            Reader rd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(rd);

            System.out.println("입력해봐!");
            String str =  br.readLine(); //입력받은 데이터를 읽음

            //빠른출력
            Writer dw = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(dw);

            bw.write(str); //출력
            bw.flush();

        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
