package quiz11;

public class Rect extends Shape{
	
	//1.변의 길이 선언
    double width;
    double height;

	//2.사각형은 생성될 때 이름과, 변의 길이를 받음
    public Rect(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

	//3.getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
    @Override
    public double getArea() {
        return width * height;
    }

	//main에서 확인

}
