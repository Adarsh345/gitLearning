package innerClass;

public class AccessingFromOuterClass {
	static class InnerClassSample{
		private int y = 20;
		static void m1() {
			System.out.println("Inner class SM m1");
		}
		void m2() {
			System.out.println("inner class NSM m2");
			
		}
	}
	public static void main(String[] args) {
		InnerClassSample.m1();
         
		InnerClassSample innerClassSample = new InnerClassSample();
		innerClassSample.m2();
		System.out.println(innerClassSample.y);
	}

}
