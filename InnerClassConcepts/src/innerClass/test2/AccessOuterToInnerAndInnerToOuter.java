package innerClass.test2;

public class AccessOuterToInnerAndInnerToOuter {
	static {
		System.out.println("outer class is loaded");
	}
	public AccessOuterToInnerAndInnerToOuter() {
		System.out.println("OuterClass counstroctor");
	}
	static class A{
		static {
			System.out.println("Inner class is loaded");
		}
		A(){
			System.out.println("Inner class counstroctor");
		}
		static void m1() {
			System.out.println("inner class sm");
		}
		void m2() {
			System.out.println("inner class nsm");
		}
		public static void main(String[] args) {
			System.out.println("inner class main");
			//AccessOuterToInnerAndInnerToOuter.m1();
			AccessOuterToInnerAndInnerToOuter accessOuterToInnerAndInnerToOuter = new AccessOuterToInnerAndInnerToOuter();
			//accessOuterToInnerAndInnerToOuter.m1();
		}
	}
	static void m3() {
		System.out.println("outer class sm");
	}
	void m4() {
		System.out.println("outer class NSM");
	}
	public static void main() {
		System.out.println("outer class main");
		A.m3();
		A a = new A();
		a.m4();
	}
	
}
