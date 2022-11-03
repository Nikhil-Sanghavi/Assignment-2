
public class MergeSort {

	void doMerge(int[] nums, int start, int mid, int end) {
		int n1, n2;
		n1 = mid - start + 1;
		n2 = end - mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for (int i = 0; i<n1;i++)
			left[i] = nums[start + i];
		
		for (int j = 0; j < n2; j++)
			right[j] = nums[mid + 1 + j];
		
		int i, j, k;
		i=j=0;
		k = start;
		
		while (i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				nums[k] = left[i];
				i++;
			}else {
				nums[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			nums[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			nums[k] = right[j];
			j++;
			k++;
		}
	}
	void doSort(int[] nums, int start, int end) {
		if (start < end) {
			int mid = (start + end) /2;
			doSort(nums, start, mid);
			doSort(nums, mid+1, end);
			doMerge(nums, start, mid, end);
		}
	}
	void printArr(int[] nums) {
		
		for(int e : nums)
			System.out.print(e + " ");
		System.out.println();
	}
	public static void main(String[] args) {

		MergeSort m = new MergeSort();
		
//		int[] nums = {12,15,67,14,78,25,12,1,99,1,50,25,75,15,79};
//		int[] nums = {41,15,25,20,12,17,99,12,99};
//		int[] nums = {1};
//		int[] nums = {};
		int[] nums = {1,1,1,1,1};
		System.out.println("Merge Sort");
		System.out.print("Beofre Sorting : ");
		m.printArr(nums);
		
		m.doSort(nums, 0 ,nums.length-1);
		
		System.out.print("After Sorting  : ");
		m.printArr(nums);
		
	}

}
