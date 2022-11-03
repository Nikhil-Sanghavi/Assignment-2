import java.util.Scanner;

public class Test {

	private static void pattern(char c)
	{
		System.out.println("Pattern " + c);
		System.out.println();
		int  n = 13;
		switch(c) {
			case 'A':
				draw_A(n);
				break;
			case 'B':
				draw_B(n);
				break;
			case 'C':
				draw_C(n);
				break;
			case 'D':
				draw_D(n);
				break;
			case 'E':
				draw_E(n);
				break;
			case 'F':
				draw_F(n);
				break;
			case 'G':
				draw_G(n);
				break;
			case 'H':
				draw_H(n);
				break;
			case 'I':
				draw_I(n);
				break;
			case 'J':
				draw_J(n);
				break;
			case 'K':
				draw_K(n);
				break;
			case 'L':
				draw_L(n);
				break;
			case 'M':
				draw_M(n);
				break;
			case 'N':
				draw_N(n);
				break;
			case 'O':
				draw_O(n);
				break;
			case 'P':
				draw_P(n);
				break;
			case 'Q':
				draw_Q(n);
				break;
			case 'R':
				draw_R(n);
				break;
			case 'S':
				draw_S(n);
				break;
			case 'T':
				draw_T(n);
				break;
			case 'U':
				draw_U(n);
				break;
			case 'V':
				draw_V(n);
				break;
			case 'W':
				draw_W(n);
				break;
			case 'X':
				draw_X(n);
				break;
			case 'Y':
				draw_Y(n);
				break;
			case 'Z':
				draw_Z(n);
				break;
			default:
				System.out.println("patteren not yet implemented");
		}
	}
	private static void draw_A(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
//				if ((i==0) || (i==n-1) || (j==0) || (j==n-1)
//						|| (i==n/2) || (i==n/4) || (i==3*n/4) 
//						|| (j==n/2) || (j==n/4) || (j==3*n/4))
				if ((i==0 && j>0 && j < n) || (j==0 && i>0) || (j==n && i>0)
						|| (i==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_B(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0 && j<n) || (j==0 && i>0 && i<n) || (i==n/2 && j<n)
						|| (i==n && j<n) || (j==n && i>0 && i<n && i!= n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_C(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0 && i>0 && i<n) || (i==0 && j>0 && j<n) || (i==n && j>0 && j<n)
						|| (i==1 && j==n) || (i==n-1 && j== n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_D(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0 && j<n) || (i==n && j<n) || (j==0) || (j==n && i>0 && i<n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_E(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0) || (i==n) || (j==0) || (i==n/2 && j<3*n/4))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_F(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (i==0) || (i==n/2 && j<3*n/4))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_G(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0 && i>0 && i<n) || (i==0 && j>0 & j < 3*n/4) || (i==n && j>0 && j<3*n/4)
						|| (j==3*n/4 && i<n && i>= n/2) ||(i==n/2 && j>=3*n/4-1) ||(j==3*n/4 && i>= n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_H(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (j==n) || (i==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_I(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0) || (i==n) || (j==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_J(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0) || (j==n/2 && i<n) || (i==n && j>0 && j<n/2) || (j==0 && i==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_K(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (i+j == n/2) || (i-j == n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_L(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (i==n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_M(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (j==n) || (i==j && i<n/2) || (i+j == n && j>n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_N(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (j==n) || (i==j) )
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_O(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0 && j>0 && j<n) || (i==n & j>0 && j<n)
						|| (j==0 && i>0 && i<n) || (j==n && i>0 && i<n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_P(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (i==0 && j<n) || (j==n && i>0 && i<n/2) || (i==n/2 && j<n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_Q(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0 && j>0 && j<3*n/4) || (i==n && j>0 && j<3*n/4) 
						|| (j==0 && i>0 && i<n) || (j==3*n/4 && i>0 && i<n)
						|| (i==j && i>=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_R(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0) || (i==0 && j<n/2) || (j==n/2 && i>0 && i<n/2) || (i==n/2 && j<n/2) 
						|| (i-j == n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_S(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0 && j>0 && j<n) || (i==n && j>0 && j<n) 
						|| (j==0 && i>0 && i<n/2) || (j==n && i>n/2 && i<n) 
						|| (i==n/2 && j>0 & j<n)
						|| (i==1 && j==n) || (j==0 && i==n-1))
						
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_T(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0) || (j==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_U(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((j==0 && i<n) || (j==n && i<n) || (i==n && j>0 && j<n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_V(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=2*n; j++)
				if ((i==j) || i+j==2*n)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_W(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=3*n; j++)
				if ((i==j) || (i+j==3*n) || (j>n && i==j-n && i>n/2) || (j>n && i>n/2 && i+j == 2*n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_X(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==j) || (i+j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_Y(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==j && j< n/2) || (i+j == n && j > n/2) || (j==n/2 && i>= n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	private static void draw_Z(int n) {
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if ((i==0) || (i==n) || (i+j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.print("enter a character : ");
			c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			if (c == '*') {
				System.out.println("Bye");
				break;
			}
			pattern(c);
		}
		sc.close();
	}

}
