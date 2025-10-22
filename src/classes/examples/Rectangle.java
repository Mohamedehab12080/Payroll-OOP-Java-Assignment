package classes.examples;

public class Rectangle implements ShapeInterface {

    int b;

    public Rectangle(int b) {
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return b*b;
    }
}
