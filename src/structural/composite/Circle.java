package structural.composite;

/**
 * Created by rachit on 5/2/18.
 */
public class Circle implements Shape {


    public Circle() {
    }

    @Override
    public void drawShape(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
