package example.factory_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/5 9:23
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
