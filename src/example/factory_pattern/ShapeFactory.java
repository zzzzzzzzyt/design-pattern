package example.factory_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/5 9:23
 **/
public class ShapeFactory {
    Shape getShape(String shape){
        if (shape.equals("circle")){
            return new Circle();
        }else if (shape.equals("rectangle")){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
