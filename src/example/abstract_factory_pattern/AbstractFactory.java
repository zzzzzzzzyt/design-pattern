package example.abstract_factory_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/5 9:35
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
