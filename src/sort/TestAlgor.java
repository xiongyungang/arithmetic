package sort;

import java.util.Arrays;


public class TestAlgor {
    public static void main(String[] args) {
        int[] arrays = {99, 85, 75, 65, 56, 401, 38, 24, 12, 5};
        // bubble(arrays);
         choose(arrays);
        // insert(arrays);
        // quick(arrays, 0, arrays.length - 1);
        // mergeSort(arrays, 0, arrays.length - 1);
        // redix(arrays);
        // shellsort(arrays);

        //System.out.println(binarySearch(arrays,38));

        System.out.println(Arrays.toString(arrays));
    }

    private static void choose(int[] arrays) {
        for (int i=0;i<arrays.length-1;i++) {
            int min = i;
            for(int j =i;j<arrays.length;j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int temp = arrays[min];
            arrays[min] = arrays[i];
            arrays[i] = temp;
        }
    }


}
