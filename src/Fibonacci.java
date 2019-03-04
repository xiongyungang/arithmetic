import java.util.Arrays;

/**
 * 斐波那契数列:0,1,1,2,3,5,8,13,21...
 */
public class Fibonacci {
    public static void main(String arg[]) {
        int size = 10;
        int[] sz = new int[size];
        sz[0]=0;
        sz[1]=1;
        for (int i=2;i<size;i++) {
            sz[i] = sz[i-1] + sz[i-2];
        }
        System.out.println("Arrays.toString(sz) = " + Arrays.toString(sz));
    }
}
