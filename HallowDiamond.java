package pattern.programs;
import java.util.*;
public class HallowDiamond {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number =");
		int n=sc.nextInt();
		 int r,c,nor=n,noc=n;
		 for(r=1;r<=n*2-1;r++) {
			 for(c=1;c<=n*2-1;c++) {
				 if(c==nor||c==noc) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 if(r<n) {
				 nor--;
				 noc++;
			 }
			 else {
				 nor++;
				 noc--;
			 }
			 System.out.println();
		 }
	}

}
