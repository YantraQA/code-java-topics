package _11_Session._1_FinalKeyword;

class Parent_1 {
	
	public void test()
	{
		System.out.println("Hi this is test method in Parent Class");
	}
	
}

//final class Parent_1 {
//	
//	public void test()
//	{
//		System.out.println("Hi this is test method in Parent Class");
//	}
//	
//}

public class _1_FinalKeyword_3 extends Parent_1 {
	
	@Override
	public void test()
	{
		System.out.println("Hi this is test method in Child Class");
	}
	
	public static void main(String[] args) {
		
		_1_FinalKeyword_3 ch = new _1_FinalKeyword_3();
		ch.test();
		
	}
}


