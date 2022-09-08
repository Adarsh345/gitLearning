package innerClass.accessingInnerClassMemberFromOutSideClass;

/*We can not access private inner class static memeber form outside of the class*/
public class Sample {
	public static void main(String[] args) {
		System.out.println("a " + Example.A.a);
		
		Example.A a1 = new Example.A();
		System.out.println("x : "+ a1.x);
	}
}
