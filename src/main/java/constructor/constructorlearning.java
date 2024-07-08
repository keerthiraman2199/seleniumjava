
package constructor;
 
public class constructorlearning {
	constructorlearning (int x) {
		this.x = x;
	}
	public constructorlearning (int x, String s ) {
		this.x= x;
		this.name = s;
	}
	 int x;
	String name;
	void constructor() {
		System.out.println(x+ "--->" +name);
	}
 
	public static void main(String[] args) {
		constructorlearning is = new constructorlearning(1000);
		is.constructor();
		constructorlearning is1 = new constructorlearning(2000,"keerthi");
		is1.constructor();

 
	}
 
}