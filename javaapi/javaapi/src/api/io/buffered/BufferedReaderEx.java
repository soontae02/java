package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\bye.txt"));

            //System.out.println( br.readLine() ); //한줄 읽기

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch  (Exception e) {
            e.printStackTrace();
        }

    }
}
