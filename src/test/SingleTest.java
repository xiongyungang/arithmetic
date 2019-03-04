package test;

import pattern.single.Singleton2;
import pattern.single.Singleton3;

public class SingleTest {
    public static void main(String arg[]) {
//        Singleton2 singleton2 = Singleton2.INSTANSE;
//        System.out.println(singleton2);

        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();

        System.out.println(instance1==instance2);


    }
}
