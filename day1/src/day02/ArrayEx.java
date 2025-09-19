package day02;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        //배열의 선언
        int[] arr;

        //배열을 생성
        arr = new int[5];

        System.out.println(arr); //주소값 - 배열이 컴퓨터 안에 만들어진 위치
        System.out.println( Arrays.toString(arr) ); //배열의 값을 문자열로 확인하는 기능
        //배열은 값을 지정하지 않으면, 각 타입의 기본값으로 자동 초기화 됩니다.

        //배열의 사용 - index
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //arr[5] = 6; //배열의 범위를 벗어나면 에러발생

        System.out.println("첫번째 값:" + arr[0]);
        System.out.println("마지막 값:" + arr[4]);
        System.out.println( Arrays.toString(arr) );

        //배열의 길이 확인
        System.out.println( "배열의길이:" + arr.length );

        //배열의 선언과 생성을 한 번에
        byte[] arr2 = new byte[5];

        //배열의 선언과 초기화를 한 번에 하는 문법.
        int[] arr3 =  {1, 2, 3, 4};
        int[] arr4 = new int[] {1, 2, 3, 4};

    }
}
