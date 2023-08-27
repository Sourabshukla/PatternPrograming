package pattern.programs;
import java.util.*;
public class Patterrn {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		int r;
		for(r=0;r<n;r++) {
			System.out.print("* ");
		}
		System.out.println();
		for(r=1;r<=n;r++) {
			System.out.println("*");	
		}
		/*System.out.println();
		for(r=n;r>0;r--) {
			System.out.print("* ");	
		}
		System.out.println();
		for(r=n-1;r>=0;r--) {
			System.out.print("* ");	
		}*/
	}

}
