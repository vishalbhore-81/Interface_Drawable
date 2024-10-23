public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(6);

        Shape[] shapes = new Shape[1];
        shapes[0] = circle;

        circle.draw();

        System.out.println("Circle area: " + circle.calculateArea());
        square.draw();
        System.out.println("Square area: " + square.calculateArea());

        Geometry geometry = new Geometry();
        Geometry.Point point = geometry.new Point(6,9);
        point.displayPoint();


    }
}