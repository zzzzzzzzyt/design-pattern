package example.abstract_factory_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/5 9:41
 * ���󹤳�ģʽ
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();


        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
