package demo;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		String str = "SateesH";
		String str1 = "SateesH";

		char ch = str.charAt(0);
		System.out.println(ch);
		int a = str.codePointAt(6);
		int c = str.codePointBefore(7);
		int d = str.codePointCount(0, 7);
		System.out.println(ch + " " + a + " " + c + " " + d);

		int e = str.compareTo(str1);
		System.out.println(e);

		String str2 = "SateesH";
		String str3 = "sateesh";
		int f = str2.compareToIgnoreCase(str3);
		System.out.println(f);

		String str4 = str2.concat(str3);
		System.out.println(str4);

		boolean b = str3.contains("ees");
		System.out.println(b);

		boolean b1 = str.contentEquals(str1);
		System.out.println(b1);

		char[] charray = { 'h', 'e', 'l', 'l', 'o' };
		String str5 = "";
		str5 = str5.copyValueOf(charray);
		System.out.println(str5);
//
		String str6 = "";
		str6 = str6.copyValueOf(charray, 1, 3);
// h-0,e-1,l-2,l-3,0-4.Here it is starting from index 1 i.e from e, and from there it will take 3 values i.e. e,l,l
		System.out.println(str6);
		
		String mainStr = "Hello World!";
		String subStr = mainStr.substring(1,3);
		System.out.println(subStr);
		
		String subStr1 = mainStr.substring(mainStr.length() - 1);
		System.out.println(subStr1);
		
		String subStr2 = mainStr.substring(1);
		System.out.println(subStr2);
		
		

		// after 4th index o , e comes at 10th index
		String str7 = "Hello planet earth, you are a great planet.";
		System.out.println(str7.indexOf("e", 4));

		String str8 = "";
		System.out.println(str8.isEmpty());

		String str9 = "Hello planet earth, you are a great planet.";
		System.out.println(str9.lastIndexOf("planet"));

		String str10[] = str9.split(" ");
		System.out.println(str10[1]);
		for (String value : str10) {
			System.out.print(value + " ");
		}
		
		for (int i = 0; i < str10.length; i++) {
			System.out.print(str10[i] + " ");
		}

		for (int i = str10.length - 1; i >= 0; i--) {
			System.out.print(str10[i] + " ");
		}

		String str11 = "This is a Java Program";
		String strArray[] = str11.split(" ");
		String revStr = "";
		
		for (int i = strArray.length - 1; i >= 0; i--) {
			revStr += (strArray[i]) + " ";
		}
		System.out.println(revStr);
		
		String str12 = "Hello";
		System.out.println(str12.replace('l', 'p'));
		char[] str13= null;
		str13=str12.toCharArray();
		System.out.println(str13[0]);
		for (char value : str13) {
			System.out.print(value);
		}
		
		int[] intArray = { 11, 12, 13, 14, 15, 16, -17 };
		List<Integer> mainArrayList = new ArrayList<>();
		System.out.println(mainArrayList);
		for (int i : intArray) {
			mainArrayList.add(i);
		}
		System.out.println(mainArrayList);
		for (Integer value : mainArrayList) {
			System.out.print(value+" ");
		}
	}
}
