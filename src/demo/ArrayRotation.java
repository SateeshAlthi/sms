package demo;

public class ArrayRotation {

		public static void main(String[] args) {
			int[] oA = new int[] {1, 2, 3, 4, 5, 6};
			System.out.println("Before shift: ");
			for (int i = 0; i < oA.length; i++) {
				System.out.print(oA[i] + " ");
			}
			int nOShifts = 3;
			
			for(int i=0; i<nOShifts; i++) {
				
				int lE = oA[oA.length - 1];
				
				for(int j=oA.length-1; j>0; j--) {
					System.out.println("Last Element: " + lE );
					oA[j] = oA[j-1];
					System.out.println("OA[j]: "+  oA[j]);
					System.out.println("LastEle: " + lE + " NewEle: "+ oA[j]);
				}
				oA[0] = lE;
			}
			System.out.println();
			System.out.println("After shift: ");
			for (int i = 0; i < oA.length; i++) {
				System.out.print(oA[i] + " ");
			}
		}
	}

	

