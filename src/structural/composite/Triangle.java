package structural.composite;

/**
 * Created by rachit on 5/2/18.
 */
public class Triangle implements Shape {

    public Triangle() {
    }

    @Override
    public void drawShape(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);

    }
}
