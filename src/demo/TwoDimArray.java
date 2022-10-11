package demo;
public class TwoDimArray {
	public static void main(String[] args) {
		int[][] tDA = new int[3][3];
		
		for(int r=0; r<tDA.length; r++) {
			for(int c=0; c<tDA[r].length;c++) {
				tDA[r][c] = r + c * 10;
			}
		}
		
		for(int r=0; r<tDA.length; r++) {
			for(int c=0; c<tDA[r].length;c++) {
				System.out.println("twoDArray["+r+"]["+c+"] : " +tDA[r][c]);
			}
	
		System.out.println(tDA[r].length);
		}
		}
}
