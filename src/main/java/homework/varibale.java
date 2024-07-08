
//local and gobal variable --homework

package homework;
 
public class varibale {

	int a = 1;

	public void local (int x , int y) {

		System.out.println(x+y);

		System.out.println(this.a);

	}

 
	public static void main(String[] args) {

		varibale v = new varibale();

		v.local(10,10);

 
	}
 
}