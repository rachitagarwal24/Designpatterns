package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rachit on 5/2/18.
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    public Drawing() {
    }


    @Override
    public void drawShape(String fillColor) {
        for(Shape shape : shapes){
            shape.drawShape(fillColor);
        }
    }

    public void add(Shape s){
        shapes.add(s);
    }

    public void remove(Shape s){
        shapes.remove(s);
    }

    public void clear(){
        System.out.println("clearing all shapes");
        shapes.clear();
    }
}
