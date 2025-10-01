package api.util.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        //<키, 값>
        //HashMap<Integer, String> map = new HashMap<>();
        Map<Integer,String> map = new HashMap<>();
        
        //값을 저장하는 메서드
        map.put(1, "홍길동");
        map.put(2, "홍길자");
        map.put(3, "이순신");
        map.put(4, "신사임당");

        System.out.println(map.size());
        System.out.println(map.toString());

        //맵에 key는 고유하기 때문에, 동일한 키를 저장하면, 값이 수정됩니다.
        map.put(4, "철수");
        System.out.println(map.toString());

        //값 얻기
        String val = map.get(4);
        System.out.println("4번 키의 값은: " + val);

        //맵을 반복하려면 key를 -> set으로 변경 -> iterator
        Set<Integer> set = map.keySet();
        for (int i : set) {
            System.out.println( i + "키 값: " + map.get(i) );
        }

        //entrySet
        Set<Map.Entry<Integer,String>> sets = map.entrySet();

        for (Map.Entry<Integer,String> entry : sets) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        //키 or 값의 유무를 contains 확인
        if ( map.containsKey(4) ) {
            System.out.println("4번 키는 존재함");
        }

        if (map.containsValue(5) ) {
            System.out.println(("홍길동 값은 존재함"));
        }

        //삭제
        map.remove(4);
        System.out.println( map.toString() );

    }
}
