package demo;

public class StarPrint {
public static void main(String[] args) {
//		System.out.println("Square");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
////    			System.out.print("*");
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		System.out.println("Hollow Square");
//		int no = 1;
//	for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				if (i == 0 || i == 3) {
//					System.out.print(no++);
//	    			System.out.print("*");
//				} else {
//					if (j == 0 || j == 3) {
//						System.out.print(no++);
//	    			System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			no = 1;
//			System.out.println();
//		}
//		System.out.println("Left Triangle ");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
////    			System.out.print("*");
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		System.out.println("LeftDown Triangle");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4 - i; j++) {
////    			System.out.print("*");
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		System.out.println("Right Triangle");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 1; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
////    			System.out.print("*");
//				System.out.print(k);
//			}
//			System.out.println();
//		}
//		System.out.println("RightDown Triangle");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 4 - i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("LeftDown Triangle");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 4; j > i; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		System.out.println("Pyramid");		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <4-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
