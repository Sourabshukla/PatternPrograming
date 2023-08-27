package pattern.programs;
import java.util.*;
public class SunGlass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number =");
		int n=sc.nextInt();
		if(n%2==0) {
			n=n+1; //if we gave 4 then it will add 1 in "n" 
		}
		int r,c;
		for(r=1;r<=n;r++) {
			for(c=1;c<=n;c++) {
				if(r==1||r==n||r==c||r+c==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*
 

*****
 * * 
  *  
 * * 
***** 


*/