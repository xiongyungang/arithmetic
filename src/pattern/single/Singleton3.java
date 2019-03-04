package pattern.single;

/**
 * 单列模式
 *
 * 懒汉式-适用于单线程
 *
 * 特点：延时创建实例对象
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
