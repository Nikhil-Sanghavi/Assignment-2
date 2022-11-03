
public class QuickSort {

	int setPivotPosition(int[] nums, int start, int end) {
		int pivot = start;
		int left = start;
		int right = end;
		while(true) {
			if (pivot < right) {
				if (nums[pivot] >= nums[right]) {
					int t = nums[right];
					nums[right] = nums[pivot];
					nums[pivot] = t;
					pivot = right;
					left++;
				}else {
					right--;
				}
			}else if (pivot > left) {
				if(nums[pivot] <= nums[left]) {
					int t = nums[left];
					nums[left] = nums[pivot];
					nums[pivot] = t;
					pivot = left;
					right--;
				}else {
					left++;
				}
			}else
				break;
		}
		return pivot;
	}
	
	void doSort(int [] nums, int start, int end) {
		int p = setPivotPosition(nums, start, end);
		if (start < p-1)
			doSort(nums, start, p-1);
		if(p+1 < end)
			doSort(nums, p+1, end);
	}
	void printArray(int [] nums) {
		for(int e : nums)
			System.out.print(e + " ");
		System.out.println();
	}
	public static void main(String[] args) {

//			int[] nums = {12,15,67,14,78,25,12,1,99,1,50,25,75,15,79};
//			int[] nums = {41,15,25,20,12,17,99,12,99};
//			int[] nums = {1};
//			int[] nums = {};
			int[] nums = {1,1,1,1,1};
			System.out.println("Quick Sort");
			QuickSort q = new QuickSort();
			System.out.print("Before sorting : ");
			q.printArray(nums);
			
			q.doSort(nums, 0, nums.length-1);
			
			System.out.print("After QuickSort : ");
			q.printArray(nums);
			
	}

}
