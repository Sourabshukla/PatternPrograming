package pattern.programs;
public class Butterfly {
	public static void main(String[] args) {
		int r,c,n=5,nor=1,noc=(n*2)-1;
		for(r=1;r<=(n*2)-1;r++) {
			for(c=1;c<=(n*2)-1;c++) {
				if(c<=nor || c>=noc) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(r<n) {
				nor++;
				noc--;
			}
			else {
				nor--;
				noc++;
			}
			System.out.println();
		}
	}
}
/*

*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *


*/