package innerClass;

public class AccessingNonStaticMemberForStaticInnerClass {
	int a = 10 ; 
	static class sample{
		public static void main(String[] args) {
			AccessingNonStaticMemberForStaticInnerClass accessingNonStaticMemberForStaticInnerClass = new AccessingNonStaticMemberForStaticInnerClass();
			System.out.println(accessingNonStaticMemberForStaticInnerClass.a);
		}
	}

}
