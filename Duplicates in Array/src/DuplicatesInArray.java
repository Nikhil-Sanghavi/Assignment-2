public class DuplicatesInArray {

	public static void main(String[] args) {

		int [] a = {1,5,9,23,5,17,3,1,5};
		System.out.println("Dupicate entries in an array");
		for (int i=0; i<a.length; i++) 
			for (int j=0;j<a.length;j++) 
				if ((a[i] == a[j]) && (i != j)) {
					System.out.println("element " + a[i] + " at position " + i);
					break;
				}
		}
}

