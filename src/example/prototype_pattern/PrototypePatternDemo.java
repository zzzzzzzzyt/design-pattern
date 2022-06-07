package example.prototype_pattern;

/**
 * @Author ×£Ó¢Ì¨Õ¨ÓÍÌõ
 * @Time : 2022/6/7 9:29
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        cloneShape1.draw();

        Shape cloneShape2 = ShapeCache.getShape("2");
        cloneShape2.draw();
    }
}
