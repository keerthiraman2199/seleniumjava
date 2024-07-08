//static & non static example--homework
 
package homework;
 
public class person {
 
 
	static   int x = 0;
	int y= 0;
	int z = 10;
	void increment() {
		x++;
		y++;
	z--;
	System.out.println("static=>" +x+   "non -static=>" +y+   "non-static=>" +z);
	}
	public static void main(String[] args) {
		person p = new person();
				p.increment();
				p.increment();
	 person p1 = new person();
				p1.increment();
				p1.increment();
	person p2 = new person();
				p2.increment();
				p2.increment();
    person p3 = new person();
				p3.increment();
				p3.increment();
 
	}
 
}