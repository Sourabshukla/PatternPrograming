package pattern.programs;

public class Hallow {
	public static void main(String[] args) {
		int r,c,n=5;
		for(r=1;r<=n;r++) {
			for(c=1;c<=r;c++) {
				if(c==1||r==n||r==c) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
