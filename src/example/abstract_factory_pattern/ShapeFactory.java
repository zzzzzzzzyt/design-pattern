package example.abstract_factory_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/5 9:36
 **/
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape.equals("circle")){
            return new Circle();
        }else if (shape.equals("square")){
            return new Square();
        }else {
            return null;
        }
    }
}
