package example.abstract_factory_pattern;

/**
 * @Author ×£Ó¢Ì¨Õ¨ÓÍÌõ
 * @Time : 2022/6/5 9:36
 **/
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color.equals("red")){
            return new Red();
        }else if (color.equals("blue")){
            return new Blue();
        }else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
