package example.singleton_pattern;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 8:54
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 **/
public class SingletonLazyLoading {
    private static class SingletonHolder {
        private static final SingletonLazyLoading INSTANCE = new SingletonLazyLoading();
    }

    private SingletonLazyLoading() {

    }

    //因为放在holder中的话 也不会立刻加载 只有调用holder时 里面的对象才会被初始化
    public static SingletonLazyLoading getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
