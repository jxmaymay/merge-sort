
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		if (lo < hi) {
			int mid = ((lo + hi) / 2);
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
	}
	
	public static void merge(int[] testArray, int lo, int mid, int hi) {
		int p1 = lo;
		int p2 = mid + 1;
		int p3 = lo;
		int[] swapList = new int[testArray.length];
		while (p1 < mid && p2 < hi) {
			if (testArray[p1] < testArray[p2]) {
				swapList[p3] = testArray[p1];
				p1++;
				p3++;
			} else {
				swapList[p3] = testArray[p2];
				p2++;
				p3++;
			}
		}
		System.arraycopy(testArray, 0, swapList, 0, testArray.length);
    }
}
