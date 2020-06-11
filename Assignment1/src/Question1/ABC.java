package Question1;

public class ABC {
	int a;
	
	public ABC(int a) {
		this.a = a;
	}
	
	public void f1() {
		int b = 200;
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(b / a);
	}
	
	public static void main(String[] args) {
		ABC abc1 = new ABC(10);
		
		System.out.println(abc1.a);
		abc1.f1();
	}
}
