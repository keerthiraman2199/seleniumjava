package localandinstancevaribale;

public class varibale {

	int c= 20;
	public void addtwonumber(int a, int b) {
		System.out.println(a+b+this.c);
	}
	
	public static void main(String[] args) {
		varibale v = new varibale();
		v.addtwonumber(10,15);
	}

}
