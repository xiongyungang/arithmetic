package sort;
/*
 * 选择排序，不稳定的排序方法（2个相等的数其在序列的前后位置顺序和排序后它们两个的前后位置顺序不相同）
 *
 * 规律：遍历整个数组，找出最大或最小元素和数组头或数组尾交换
 *
 * 注意：内层循环不要-1，和尾部交换时尾部下表为len-i-1
 */
import java.util.Arrays;

public class Choose {
	public static void main(String[] args) {
		int[] sz = { 3, 5, 7, 5, 4, 3, 554, 43, 232, 67, 3, 212, 3, 546, 0 };
		System.out.println("原数组：" + Arrays.toString(sz));
		method1(sz);//从数组尾部开始
		method2(sz);//从数组头部开始
	}

	private static void method2(int[] sz) {
		//重置
		int min = 0;
		
		//外层循环控制需要排序的趟数
		for (int i = 0; i < sz.length - 1; i++) {
			min = i;
		    //内层循环控制遍历数组的个数并得到最大/最小
			for (int j = i; j < sz.length; j++) {
				if (sz[j] < sz[min]) {
					min = j;
				}
			}
			// 交换
			int temp = sz[i];// 当前定位的数组元素
			sz[i] = sz[min];
			sz[min] = temp;
		}
		System.out.println("method1排序数组：" + Arrays.toString(sz));
	}

	private static void method1(int[] sz) {
		int max = 0;
		for (int i = 0; i < sz.length - 1; i++) {
			max = 0;// 重置
			for (int j = 0; j < sz.length - i; j++) {
				if(sz[j]>sz[max]){
					max=j;
				}
			}
			//交换
			int temp = sz[sz.length-i-1];//这里当前元素是最后一个，要-1否则溢出
			sz[sz.length-i-1] = sz[max];
			sz[max] = temp;
		}
		System.out.println("method2排序数组：" + Arrays.toString(sz));
	}

}
