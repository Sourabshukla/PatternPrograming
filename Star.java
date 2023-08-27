package pattern.programs;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int r,c;
		for(r=1;r<=n;r++) {
			System.out.println();
			for(c=n;c>=r;c--) {
				System.out.print("*");
			}
		}
		System.out.println();
		
	}
}


/*
	*****
	****
	***
	**
	*
*/