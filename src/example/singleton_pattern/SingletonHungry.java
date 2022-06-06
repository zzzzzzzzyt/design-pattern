package example.singleton_pattern;

/**
 * @Author ×£Ó¢Ì¨Õ¨ÓÍÌõ
 * @Time : 2022/6/6 8:38
 * ¶öººÊ½
 **/
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
