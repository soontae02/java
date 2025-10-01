package api.io.stream;

import java.io.*;
import java.util.Arrays;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {

        try {

            //바로 선언
            String path = "C:\\Users\\user\\Desktop\\course\\upload\\img.png";
            String path2 = "C:\\Users\\user\\Desktop\\course\\upload\\img2.png";


            InputStream in = new FileInputStream(path);
            OutputStream out = new FileOutputStream(path2);

            byte[] arr = new byte[1024];

//            int result = in.read(arr);
//            System.out.println("읽어들인 길이: " + result);
//            System.out.println( Arrays.toString(arr) );

            int result;
            while ( (result = in.read(arr) ) != -1) {
                out.write(arr, 0, result); //배열, 시작값, 끝값
            }

            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {}
        }

    }
}
