package api.ramda.basic2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MainClass01 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("홍길동", "이순신", "홍길자");
        //외부에서 반복자
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) { //다음이 있어?
            System.out.println(iter.next());
        }

        //람다스트림이 제공하는 내부반복자 방식
        Stream<String> stream = list.stream();

        list.stream().forEach( s -> System.out.println(s) );

    }

}
