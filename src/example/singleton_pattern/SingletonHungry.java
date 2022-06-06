package example.singleton_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/6 8:38
 * ����ʽ
 **/
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
