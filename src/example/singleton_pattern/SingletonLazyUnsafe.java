package example.singleton_pattern;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 8:38
 * 线程不安全的懒汉式
 **/
public class SingletonLazyUnsafe {
    private static SingletonLazyUnsafe instance;

    private SingletonLazyUnsafe() {
    }

    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
