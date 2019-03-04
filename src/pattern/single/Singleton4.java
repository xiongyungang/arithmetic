package pattern.single;

/**
 * 单列模式
 *
 * 懒汉式-适用于多线程
 *
 * 特点：延时创建实例对象
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        //外层if提高效益
        if (instance == null) {
            //线程锁，使用当前类的字节码为锁对象
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }
}
