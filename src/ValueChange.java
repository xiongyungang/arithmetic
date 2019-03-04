import java.util.Arrays;

public class ValueChange {
    public static void main(String arg[]) {
        int i = 1;
        Integer num = 10;
        String str = "hello";
        int[] array = {1, 2, 3, 4, 5};
        Elem elem = new Elem();

        change(i, num, str, array, elem);

        System.out.println("i = " + i);
        System.out.println("num = " + num);
        System.out.println("str = " + str);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("elem = " + elem.n);
    }

    private static void change(int i, Integer num, String str, int[] array, Elem elem) {
        i++;
        num++;
        str += "world";
        array[0]++;
        elem.n++;
    }
}

class Elem{
    int n = 10;
}
