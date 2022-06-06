package example.singleton_pattern;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 8:39
 * 双重校验锁
 **/
public class SingletonDCL {
    private static SingletonDCL instance;
    private SingletonDCL(){

    }
    public static SingletonDCL getInstance(){
        if (instance==null){
            synchronized (SingletonDCL.class){
                if (instance==null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
