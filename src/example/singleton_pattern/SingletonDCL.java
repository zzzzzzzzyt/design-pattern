package example.singleton_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/6 8:39
 * ˫��У����
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
