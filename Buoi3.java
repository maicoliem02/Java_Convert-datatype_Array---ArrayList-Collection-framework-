package Buoi03;
import java.util.Arrays;
import java.util.ArrayList;

/*
 * Convert datatype
 * Array -> ArrayList (Collection framework)
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Convert datatype (text -> normalize -> int, double, ( != String )
		 */
		// String -> normalize -> ?
//		Byte.parseByte(?);
//		Short.parseShort(?);
//		Integer.parseInt(?);
//		Long.parseLong(?);
//		Float.parseFloat(?);
//		Double.parseDouble(?);
//		Boolean.parseBoolean(?);
//		String text = "10";
//		int textAfterConvert = Integer.parseInt(text);
//		String text = "10.8";
//		double textAfterConvert = Float.parseFloat(text);
//		System.out.println(textAfterConvert + 10);
//		String text = "";
//		boolean textAfterConvert = Boolean.parseBoolean(text);
//		System.out.println(textAfterConvert);
		// ? -> normalize -> String
//		int a = 10;
//		String aAfterConvert = a + "";
//		System.out.println(aAfterConvert + 10);
//		String a = "Thành";
//		char b = a.charAt(2);
//		System.out.println(b);
		
		/*
		 *  Array
		 *  	Số(byte, short, int, long, double, float) thì có giá trị mặc định là: 0
		 *  	Ký tự(char) thì có giá trị mặc định là: '\u0000'
		 *  	Ký tự(boolean) thì có giá trị mặc định là: false
		 *  	Dữ liệu đối tượng thì có giá trị mặc định là: null
		 */
		// size init
//		boolean[] arr = new boolean[3];  // 0, 1, 2
////		arr[1] = 100;
//		arr[1] = true;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		// element init
//		int[] arr = new int[] {-1, -2, -3, -4};
//		System.out.println(Arrays.toString(arr));
//		int[][] arr = new int[2][];
//		arr[0] = new int[] {1, 2, 3, 4};
//		arr[1] = new int[] {-1, -2, -3, -4, -5};
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(arr[1][2]);
//		int[][] arr = new int[][] {
//			{10, 20, 30},
//			{40, 50, 60, 70},
//			{80, 90}
//		};
//		System.out.println(Arrays.deepToString(arr));
////		System.out.println(arr[2][3]);
////		System.out.println(arr[1][2]);
//		System.out.println(arr.length);
		
		int[] a = new int[] {2, 4, 6, 8};
		int[] b = a.clone();  // new int[] {2, 4, 6, 8}
		b[1] = 1000;
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("a: " + Arrays.toString(a));
		
		/*
		 * ArrayList
		 */
//		ArrayList<String> list = new ArrayList<String>();
////		String s = new String("Hello world!");
////		list.add(s);
////		list.add("Thành");
////		list.add("Java");
////		list.add(1, "Tấn");
//		list.add("A");  // 0
//		list.add("B");  // 1
//		list.add("C");  // 2
////		list.remove("B");
////		String afterRemove = list.remove(2);
////		list.set(1, "Tấn THành");
//		System.out.println(list);
//		System.out.println(list.size());
////		System.out.println(list.get(2));
////		System.out.println(list.indexOf("sdjvbaskvj"));
//		System.out.println(list.contains("C"));
////		System.out.println(afterRemove);
		
	}
	
}
