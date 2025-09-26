package quiz11;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        
        Shape squere = new Rect("사각사각", 10, 20);

        Shape circle = new Circle("원형원형", 5);

        System.out.println(squere.getName() + " 넓이: " + squere.getArea());

        System.out.println(circle.getName() + " 넓이: " + circle.getArea());
    
    }
}
