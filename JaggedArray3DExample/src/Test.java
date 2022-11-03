import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Total colleges : ");
		int totColleges = scanner.nextInt();
		int [] [] [] marks = new int[totColleges][][];

		for (int x=0;x<marks.length;x++) {
			System.out.println(String.format("Classes in college# %d : ", x+1));
			int temp = scanner.nextInt();
			marks[x] = new int[temp][];
		}

		for(int x=0; x<marks.length; x++) {
			for (int y=0;y<marks[x].length;y++) {
				System.out.println(String.format("Students in College# %d and Class# %d : ", x+1, y+1));
//				System.out.println("Students in college# " + (x+1) + " and Class# " + (y+1) + " : ");
				int temp = scanner.nextInt();
				marks[x][y] = new int[temp];
			}
		}

//		Take age of each student
		for (int x=0;x<marks.length;x++)
			for (int y=0;y<marks[x].length;y++)
				for (int z=0;z<marks[x][y].length;z++) {
					System.out.println(String.format("Enter marks for Student of College# %d and Class# %d and RollNumber %d : ", x+1, y+1, z+1));
//					System.out.println("enter marks for student of college " + (x+1) + " class " + (y+1) + " student rollNumber " + (z+1) + " : ");
					marks[x][y][z] = scanner.nextInt();
				}

//		Print marks
		System.out.println("College\tClass\tRollNo\t\tMarks");
		for (int x=0;x<marks.length;x++) {
			for (int y=0;y<marks[x].length;y++) {
				for (int z=0;z<marks[x][y].length;z++) {
					System.out.println(String.format("%d\t%d\t%d\t\t%d", x+1, y+1, z+1, marks[x][y][z]));
//					System.out.println((x+1) + "\t" + (y+1) + "\t" + (z+1) + "\t\t" + marks[x][y][z]);
				}
				System.out.println();
			}
			System.out.println();
		}
		scanner.close();
	}
}
