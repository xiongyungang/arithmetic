package sort;

/**
 * 快速排序
 *
 * https://www.bilibili.com/video/av39519566?from=search&seid=14779126765886964608
 */
public class QuickSort {
    public static void main(String arg[]) {
        int[] arr = {3, 5, 6, 3, 7, 9, 7, 4, 8, 0, 5};
        quickSort(arr, 0, arr.length-1);
        for (int e : arr) {
            System.out.println("e = " + e);
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        //左索引必须比右索引小
        if (left > right) {
            return;
        }
        //第一个数为基准数
        int bash = arr[left];
        //定义变量i，指向最左边
        int i = left;
        //定义变量j，指向最右边
        int j = right;

        //当i和j不相遇时，在循环中进行检索
        while (i != j) {
            //右边寻找比基准数小的数
            while (arr[j] >= bash && i < j) {
                j--; //j从右往左移动
            }

            //左边寻找比基准数大的数
            while (arr[i] <= bash && i < j) {
                i++;
            }

            //交换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //此时i和j相遇
        //当i和j相遇时，交换基准数和相遇位置的元素
        arr[left] = arr[i];//相遇位置赋值给基准数
        arr[i] = bash;//基准数的值赋值给相遇位置

        //基准数已经归位，左边比基准数小，右边大
        //继续排基准数左边和右边
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
