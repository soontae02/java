package day07.modi.construct.pac2;

import day07.modi.construct.pac1.A;

public class C {

    //멤버변수
    int i;
    A a = new A(1); //public (o)
//    A a2 = new A(true); //default (o)
//    A a3 = new A("홍길동"); //private (x)

    /// //////////////////////////////////
    C() {
        a.a = 1;
        //a.b = 2;
        //a.c = 3; //private (x)
        a.method01();
        //a.method02();
        //a.method03(); //private (x)
    }

}
