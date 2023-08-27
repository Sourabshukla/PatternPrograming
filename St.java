package pattern.programs;
import java.util.*;
public class St {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r,s,c;
		for(r=1;r<=p;r++) {
			for(s=p-r;s>=1;s--) {
				System.out.println(" ");
			}
			for(c=1;c<=r;c++) {
				System.out.print("*");
			}  
		}
		System.out.println();
	}

}
