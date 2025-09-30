package quiz16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass03 {
    public static void main(String[] args) {

        //메뉴를 입력받고, 메뉴에 따라서 기능을 구현.

        Scanner scan = new Scanner(System.in);

        //0. 유저를 저장할 수 있는 List선언
        List<User> list = new ArrayList<>();

        while(true){

            System.out.println("[1.회원추가, 2.회원찾기, 3.회원삭제]");
            int menu = scan.nextInt();

            if( menu == 1 ){
                //이름과, 나이를 입력받아서 list에 추가
                String name = scan.next();
                int age = scan.nextInt();

                list.add(new User(name,age));
                System.out.println(age + "세 " + name + "님이 추가되었습니다.");

            } else if( menu == 2 ){
                //이름을 입력받아서, 이름이 있으면 정보를 출력, 없으면 "찾는회원은 없습니다" 출력.
                String name = scan.next();

                for (User u : list) {
                    if ( name.equals(u.getName()) ) {
                        System.out.println(u.getName() + ", " + u.getAge());
                    } else if ( u.getName() == null ) {
                        System.out.println("찾는 회원은 없습니다.");;
                    }
                }

            } else if( menu == 3 ){
                //삭제할 이름을 입력받아서, 있으면 삭제, 없으면 "삭제할 회원이 없습니다" 출력.
                String name = scan.next();

                for (int i = 0; i < list.size(); i++) {
                    User u = list.get(i);
                    if ( name.equals(u.getName()) ) {
                        System.out.println(u.getName() + "님이 삭제되었습니다.");
                        list.remove(u);
                    } else if ( u.getName() == null ) {
                        System.out.println("삭제할 회원이 없습니다.");
                    }
                }

            }

        }

    }
}
