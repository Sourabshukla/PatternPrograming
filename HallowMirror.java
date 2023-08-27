package pattern.programs;

public class HallowMirror {
	public static void main(String[] args) {
		int r,c,s,n=5;
		for(r=1;r<=n;r++) {
			for(c=1;c<=n;c++) {
				if(c==n||r==n||c+r==n+1) {
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
