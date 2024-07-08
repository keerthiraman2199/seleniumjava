package Learnstatic;
 
public class learnstatic {
 
	int x = 0;
	static int y=0;
	void conuter() {
		x++;
		y++;
		System.out.println("non-static=>" +x+ "static=>" +y);
	}
	public static void main(String[] args) {
		learnstatic l = new learnstatic();
		l.conuter();
		l.conuter();
		System.out.println("once again creating object");
		learnstatic l1 = new learnstatic();
		l1.conuter();
		l1.conuter();
 
	}
 
}