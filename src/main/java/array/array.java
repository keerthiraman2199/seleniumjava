
package array;
 
import java.util.Arrays;
 
public class array {
 
	public static void main(String[] args) {

		String guns[] = {"AKM","AWM","GROZA","M416"};//0//1//2//3
		System.out.println(guns[1]);
		System.out.println(guns[2]);
		System.out.println(guns[guns.length-1]);
		//array.tostring
		System.out.println(guns);
		System.out.println(Arrays.toString(guns));
		//array-->int
		int [] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3]= 400;
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		}
 
}
