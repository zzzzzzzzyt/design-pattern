package example.prototype_pattern;

/**
 * @Author ×£Ó¢Ì¨Õ¨ÓÍÌõ
 * @Time : 2022/6/7 9:26
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
