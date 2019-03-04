/**
 * 面试题：自增自减的混合运算
 *
 * 技巧:
 *      赋值=，最后计算
 *      =号右边的从左到右依次压入操作数栈
 *      自增自减操作是直接修改变量值，不经过操作数栈
 */
public class Autodecrement {
    public static void main(String arg[]){
        int i = 1;
        i = i++;//i => 1,i进栈为1，出栈后覆盖了原变量值
        int j = i++;//i => 2, j => 1，i进栈时为1，出栈赋给了j，为覆盖原变量
        int k = j++ - ++i * j--;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k = " + k);
    }
}
