
public class SelectionSort {

	void doSort(int[] nums) {
		
		for(int i = 0; i<nums.length-1; i++) {
			int minPosition = i;
			for (int j = i+1; j<nums.length;j++) {
				if (nums[j] < nums[i])
					minPosition = j;
			}
			if (i != minPosition) {
				int t = nums[i];
				nums[i] = nums[minPosition];
				nums[minPosition] = t;
			}
		}
	}
	void printArr(int[] nums) {
		
		for(int e : nums)
			System.out.print(e + " ");
		System.out.println();
	}
	public static void main(String[] args) {

		SelectionSort m = new SelectionSort();
		
//		int[] nums = {12,15,67,14,78,25,12,1,99,1,50,25,75,15,79};
//		int[] nums = {41,15,25,20,12,17,99,12,99};
//		int[] nums = {1};
//		int[] nums = {};
		int[] nums = {1,1,1,1,1};
		System.out.println("Selection Sort");
		System.out.print("Beofre Sorting : ");
		m.printArr(nums);
		
		m.doSort(nums);
		
		System.out.print("After Sorting  : ");
		m.printArr(nums);
		
	}

}
