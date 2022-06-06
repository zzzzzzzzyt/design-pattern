package example.singleton_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/6 8:39
 * �̰߳�ȫ������ʽ
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
