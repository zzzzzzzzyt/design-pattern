package example.singleton_pattern;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 8:39
 * 线程安全的懒汉式
 **/
public class SingletonLazySafe {
    private static SingletonLazySafe instance;
    private SingletonLazySafe(){

    }

    public static synchronized SingletonLazySafe getInstance(){
        if (instance==null){
            instance = new SingletonLazySafe();
        }
        return instance;
    }

}
