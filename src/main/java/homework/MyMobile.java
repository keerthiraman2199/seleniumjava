//parameter --overloading homework
package homework;
 
public class MyMobile {
	public  String Redmi(String name) {
		return  name;
	}
public int Redmi(int price, int value) {
	return price+value;
}
public double Redmi(double length, double weight, double size) {
	return length+weight+size;
}
public char Redmi (char X ) {
	return X;
}
	public static void main(String[] args) {
		MyMobile M = new MyMobile();
		//String Redmi = M.Redmi(Redmi);
		System.out.println(M.Redmi("redmi"));
		System.out.println(M.Redmi(123,345));
		System.out.println(M.Redmi(5.6,2.3,3.4));
System.out.println(M.Redmi('a'));
	}
 
}