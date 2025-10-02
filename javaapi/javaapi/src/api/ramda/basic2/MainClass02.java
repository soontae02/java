package api.ramda.basic2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass02 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add( new Random().nextInt(100) + 1 );
        }

        System.out.println(list.toString());

        //중복제거 distinct
        list.stream().distinct().forEach( s -> System.out.print(s + " ") );

        //정렬 sort
        System.out.println("\n---------------------------------------------------");
        list.stream().sorted().forEach( s -> System.out.print(s + " ") );

        //필터링 filter
        System.out.println("\n---------------------------------------------------");
        list.stream()
                .filter( x -> x > 50 )
                .sorted()
                .forEach( s -> System.out.print(s + " ") );

        System.out.println("\n---------------------------------------------------");
        //map 새로운 리스트로 반환
        list.stream()
                .map( s -> s % 2 == 0 ? "짝" : "홀" )
                .forEach( s -> System.out.print(s + " ") );

        System.out.println("\n---------------------------------------------------");
        //mapTo~~~ 다른 스트림타입으로 형변환
        long x = list.stream()
                .mapToDouble( s -> s * s )
                .count(); //최종처리
        System.out.println( "리스트개수: " + x );

        System.out.println("\n---------------------------------------------------");

        //집계함수 sum
        int sum = list.stream().mapToInt( s -> s ).sum();
        System.out.println( "리스트 합계: " + sum );

        OptionalDouble result = list.stream().mapToInt(s -> s ).average();
        double avg = result.getAsDouble();
        System.out.println( "리스트 평균: " + avg );

        Optional<Integer> result2 = list.stream().max( (a, b) -> a.compareTo(b) );
        int max = result2.get();
        System.out.println( "리스트 안에서 가장 큰 값: " + max );

        System.out.println("\n---------------------------------------------------");
        //collect() - 새로운 타입의 컬렉션으로 집계할 때 사용함
        List<Integer> newList =
                list.stream()
                .filter( i -> i >= 80 )
                .collect( Collectors.toList() );

        System.out.println(newList);

        System.out.println("\n---------------------------------------------------");
        String[] arr = {"hong", "lee", "kim", "choi", "park", "kim"};
        //이 배열을 이름순으로 오름차순 정렬하고 중복되는 데이터를 제거하고 싶음.
        List<String> result3 = Arrays.asList(arr)
                .stream()
                .sorted()
                .distinct()
                .collect( Collectors.toList() );

        System.out.println(result3);

    }

}
