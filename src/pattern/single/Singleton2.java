package pattern.single;

/**
 * 枚举类实现的饿汉式单列模式
 *
 * 特点：最简洁，因为枚举类重写了toString方法，打印枚举单列对象输出枚举成员名
 */
public enum Singleton2 {
    INSTANSE
}
