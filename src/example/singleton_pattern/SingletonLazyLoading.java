package example.singleton_pattern;

/**
 * @Author ףӢ̨ը����
 * @Time : 2022/6/6 8:54
 * ���ַ�ʽ�ܴﵽ˫������ʽһ���Ĺ�Ч����ʵ�ָ��򵥡��Ծ�̬��ʹ���ӳٳ�ʼ����Ӧʹ�����ַ�ʽ������˫������ʽ��
 * ���ַ�ʽֻ�����ھ�̬��������˫������ʽ����ʵ������Ҫ�ӳٳ�ʼ��ʱʹ�á�
 **/
public class SingletonLazyLoading {
    private static class SingletonHolder {
        private static final SingletonLazyLoading INSTANCE = new SingletonLazyLoading();
    }

    private SingletonLazyLoading() {

    }

    //��Ϊ����holder�еĻ� Ҳ�������̼��� ֻ�е���holderʱ ����Ķ���Żᱻ��ʼ��
    public static SingletonLazyLoading getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
