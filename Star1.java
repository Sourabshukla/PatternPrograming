package pattern.programs;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int r,s,c;
		for(r=1;r<=n;r++){
			for(s=1;s<=r-1;s++) {
				System.out.print("");
			}
			for(c=1;c<n-r+1;c--) {
				System.out.print("*");
			}
		}
	}

}
