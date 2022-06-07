package example.prototype_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/7 9:26
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
