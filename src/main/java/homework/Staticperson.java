package homework;
//static function
 
public class Staticperson {
 
	public void eat() {
		System.out.println("eat");
	}
	public static void sleep() {
		System.out.println("sleeep");
	}
	public static void main(String[] args) {
		Staticperson.sleep();
		Staticperson Is = new Staticperson();
		Is.eat();
		//Is.sleep();

 
	}
 
}