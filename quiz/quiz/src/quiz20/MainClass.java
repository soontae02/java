package quiz20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {

        /*

        회사에서는 매일 오전 7시에 연계회사에서 날짜유형의 csv파일을 전송해줍니다.
        이 파일의 이름은 2025_10_01_data.csv 파일 유형입니다.
        아침마다 csv파일을 읽어서 가져오는 작업을 해야합니다.

        Date클래스를 활용해서 오늘 날짜 기준의 파일을 읽고
        , 기준으로 분리한 다음에 나이와 이름을 출력해주세요.

        */

        try {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
            String now = sdf.format(date);

            String filePath = "C:\\Users\\user\\Desktop\\course\\upload\\" + now + "_data.csv";
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String str;
            while( (str = br.readLine()) != null ) {
                String[] arr = str.split(",");
                if (arr.length >= 2) { // 쉼표로 분리된 요소가 최소 2개인지 확인합니다.
                    System.out.println("나이: " + arr[0]);
                    System.out.println("이름: " + arr[1]);
                }
            }

            br.close(); // 파일 리소스 사용 후 닫기

        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}