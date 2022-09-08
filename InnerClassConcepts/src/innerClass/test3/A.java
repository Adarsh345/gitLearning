package innerClass.test3;

public class A {
	static int a = 10; 
	int x = 20; 
	
	static class B{
		static int a =50;
		int x = 20; 
		 void m1() {
			 System.out.println(a);
			 System.out.println(x);
			 
			 A  instance  = new A();
			 System.out.println(A.a);
			 System.out.println(instance.x);
		 }
	}
	
	void m2() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
