package innerClass;

public class AccessingOuterClassMemberFromStaticInnerClass {
	static int a = 10;
    int x = 20; 
    private int y = 30;
    
    static class InnerClassExample{
    	public static void main(String[] args) {
			System.out.println(10);
			//System.out.println(x);
		}
    }


}
