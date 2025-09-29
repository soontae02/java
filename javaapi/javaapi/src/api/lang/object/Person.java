package api.lang.object;

public class Person extends Object implements Cloneable {
    /*모든 클래스는 object클래스를 상속받음 (생략)*/

    private String Name;

    //alt + insert

    public Person(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //객체의 주소가 아니고, 이름이 같으면 true반환
        if ( obj instanceof Person ) {
            Person p = (Person)obj;
            if(p.getName().equals(Name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( super.toString() + "객체 소멸됨" );
    }

    //객체를 복사해서 반환
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
