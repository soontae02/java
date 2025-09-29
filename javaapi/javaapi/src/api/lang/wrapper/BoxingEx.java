package api.lang.wrapper;

public class BoxingEx {
    public static void main(String[] args) {

        int a = 100;
        double b = 3.14;
        char c = 'a';

        //boxing
        //int -> 객체형으로 변환
        Integer i1 = new Integer(a);

        //unboxing
        //객체형 -> int로 변환

        //자동형변환
        Integer val1 = a;
        Double val2 = b;
        Boolean val3 = true;
        Character val4 = c;
        //기본타입과 wrapper타입의 차이점 = null값의 여부

        System.out.println("----------------------------------------------------");
        //래퍼클래스의 주된 기능 static메서드로 사용함
        int r1 = Integer.parseInt("5");
        double r2 = Double.parseDouble("3.14");
        long r3 = Long.parseLong("33");

        System.out.println(r1 + r2 + r3);

    }
}
