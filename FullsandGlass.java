package pattern.programs;

import java.util.Scanner;

public class FullsandGlass {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,c;
		for(r=1;r<=n;r++) {
			for(c=n;c<=n;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}