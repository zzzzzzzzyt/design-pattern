package example.abstract_factory_pattern;

/**
 * @Author ×£Ó¢Ì¨Õ¨ÓÍÌõ
 * @Time : 2022/6/5 9:38
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equals("color")){
            return new ColorFactory();
        }else if (choice.equals("shape")){
            return new ShapeFactory();
        }else {
            return null;
        }
    }
}
