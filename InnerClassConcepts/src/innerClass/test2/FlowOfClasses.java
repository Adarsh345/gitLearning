package innerClass.test2;

public class FlowOfClasses {
	static {
		System.out.println("Outer class is loaded");
	}
	static class A{
		static {
			System.out.println("inner Class is loaded");
		}
		public static void main(String[] args) {
			System.out.println("inner class main");
		}
	}
	public static void main(String[] args) {
		System.out.println("outer class main");
	}

}
