package pattern.programs;

public class KMirror {
	public static void main(String[] args) {
		int r,c,s,n=4;
		for(r=1;r<=(n*2)-1;r++) {
			if(r<=n) {
				for(s=1;s<=r-1;s++) {
					System.out.print(" ");
				}
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
