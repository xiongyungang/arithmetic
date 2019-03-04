package pattern.single;

/**
 * 单列模式：饿汉式
 */
class Singleton1 {
    public static final Singleton1 INSTANSE = new Singleton1();
    private Singleton1() {
    }
}
