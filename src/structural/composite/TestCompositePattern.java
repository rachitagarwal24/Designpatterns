package structural.composite;

/**
 * Created by rachit on 5/2/18.
 */
public class TestCompositePattern {

    public static void main(String arg[]) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Drawing drawing = new Drawing();

        drawing.add(triangle);
        drawing.add(triangle);

        drawing.drawShape("red");

        drawing.clear();

        drawing.add(circle);
        drawing.add(circle);
        drawing.drawShape("green");

    }
}
