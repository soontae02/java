package api.util.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        //util패키지부터는 import를 사용해야합니다.
        int[] arr = {3, 1, 5, 6, 7, 4};

        //전부 static메서드로 정의가 되어있음.
        //정렬
        Arrays.sort(arr); //퀵 sort
        System.out.println(Arrays.toString(arr));

        //이진탐색 - 선행조건: 정렬
        System.out.println(Arrays.binarySearch(arr, 6)); //6이 처음으로 발견되는 위치

        //배열의 복사
        int[] newArr = Arrays.copyOf(arr, arr.length); //배열명, 복사할 길이
        System.out.println(Arrays.toString(newArr));

        System.out.println(arr == newArr); //주소값이 다름 (완전 새로운 배열 만듦)

        //배열을 list로 변경하는 기능 ->
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,678,678,45,63,452,345);
        System.out.println(list.toString());

        //배열의 내부요소 비교
        if(Arrays.equals(arr, newArr)) {
            System.out.println("내부요소가 똑같음");
        } else {
            System.out.println("내부요소가 똑같음");
        }

    }
}
