package sort;

/*
 * 每一趟插入排序，都可以将一个无序值插入一个有序数列，直至全部值有序
 * 插入排序所耗费的时间是O(n^2)
 *
 * https://www.bilibili.com/video/av40336645?from=search&seid=17391134844455109513
 */
import java.util.Arrays;

public class Insert {
	public static void main(String[] args) {
		int[] sz = { 45, 5, 7, 5, 4, 6, 7, 65, 4, 3, 89, 7 };

		//数组第一位看作有序
		for (int i = 1; i < sz.length; i++) {
			for(int j = i; j > 0;j--) {
				if (sz[j] < sz[j - 1]) {
					int temp = sz[j];
					sz[j] = sz[j - 1];
					sz[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		System.out.println(Arrays.toString(sz));
	}
}
