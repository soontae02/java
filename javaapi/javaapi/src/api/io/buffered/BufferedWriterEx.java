package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
    public static void main(String[] args) {

        //이름에 Buffered가 붙었으면, 성능향상 보조 스트링입니다.
        //BufferedWriter
        //BufferedReader
        //BufferedInputStream
        //BufferedOutputStream

        try {

            Scanner sc = new Scanner(System.in);

            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\upload\\bye.txt"));

            while(true) {
                String str = sc.nextLine(); //입력

                if ( str.equals("그만") ) break;

                out.write(str); //출력
                out.flush(); //버퍼를 밀어냄
            }

            out.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }

    }
}
