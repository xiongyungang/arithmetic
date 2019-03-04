package pattern.single;

/**
 * 单列模式
 *
 * 懒汉式(内部类实现)-适用于多线程
 *
 * 特点：延时创建实例对象
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }

        return instance;
    }

    class Instance{
        private Instance instance = new Instance();
    }
}
