package pattern.programs;
public class HallowButterfly {
	public static void main(String[] args){
		int r,c,n=5;
		for(r=1;r<=n*2-1;r++) {
			for(c=1;c<=n*2-1;c++) {
				if(c==1||c==(n*2)-1||c==r||c+r==(n*2)) {
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


*       *
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*       * 

*/