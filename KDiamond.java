package pattern.programs;
public class KDiamond {
	public static void main(String[] args) {
		int r,c,n=4;
		for(r=1;r<=(n*2)-1;r++) {
			if(r<=n) {
				for(c=n-r+1;c>1;c--) {
					System.out.print("* ");
				}
			}
			else {
				for(c=1;c<=r-n;c++){
					System.out.print("* ");
				}
			}
			System.out.println("*");
		}
	}
}

/*


* * * *
* * *
* *
*
* *
* * *
* * * *  


*/