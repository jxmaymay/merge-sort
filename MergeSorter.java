
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		if (lo < hi) {
			int mid = ((lo + hi) / 2);
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		
		int listLen1;
		int listLen2;
		
		if (list.length % 2 == 0) {
			listLen1 = list.length / 2;
			listLen2 = listLen1;
		} else {
			listLen1 = (list.length + 1) / 2;
			listLen2 = list.length - listLen1;
		}
		
		int[] swap1 = new int[listLen1];
		int[] swap2 = new int[listLen2];
		System.arraycopy(list, lo, swap1, 0, swap1.length - 1);
		System.arraycopy(list, mid + 1, swap2, 0, swap2.length - 1);
		int j = 0;
		int k = 0;
		for (int i = 0; i < list.length / 2 - 1; i++) {
			if (swap1[j] > swap2[k]) {
				if (j > i) {
				continue;
				} else {
					list[i] = swap1[j];
					j++;
				}
			} else if (swap1[j] < swap2[k]){
				if (k > i)
				list[i] = swap2[k];
				k++;
			}
		}
		
	}
	
}
