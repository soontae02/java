package day07.encap.good;

public class MyDate {

    private int year;
    private int month;
    private int day;

    /*
    은닉변수에 접근할 때에는 클래스 설계자가 만들어놓은
    setter메서드를 사용합니다.
    setter메서드는 public선언하고, 이름을 (set + 멤버변수명)으로 지정
    */

    public void setYear(int year) {
        //메서드를 활용하면, 프로그램 코드로 의도치 않은 값을 피할 수 있음.
        if(year > 2025) {
            System.out.println("잘못된 값입니다");
            return;
        }
        this.year = year;
    }

    /*
    은닉 변수의 값을 조회하는 용도의 메서드 getter라고 함
    public으로 선언하고 이름을 (get + 멤버변수명)으로 만듭니다.
     */
    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if(month > 12 || month < 1) {
            System.out.println("잘못된 값입니다.");
            return;
        }
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if(day > 31 || day < 1) {
            System.out.println("잘못된 값입니다.");
            return;
        }
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    //getter, setter 자동완성 = alt + insert

}
