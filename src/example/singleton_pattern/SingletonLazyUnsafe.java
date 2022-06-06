package example.singleton_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/6 8:38
 * �̲߳���ȫ������ʽ
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
