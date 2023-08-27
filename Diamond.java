package pattern.programs;
import java.util.*;
public class Diamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,s,c;
		for(r=1;r<=(n*2)-1;r++) {
			if(r<=n) {
				for(s=n-r;s>=1;s--) {
					System.out.print(" ");
				}
			for(c=1;c<=r;c++) {
				System.out.print("* ");
			}
		 }
			else{
				for(s=1;s<=r-n;s++) {
					System.out.print(" ");
				}
				for(c=(n*2-r);c>=1;c--) {
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
		
		
		
	}
}


										/*
										   * 
										  * * 
										 * * * 
										* * * * 
										 * * * 
										  * * 
										   *
										 */

