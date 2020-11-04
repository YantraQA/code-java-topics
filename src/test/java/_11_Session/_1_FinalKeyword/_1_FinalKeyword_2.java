package _11_Session._1_FinalKeyword;

class Parent {
	
	public void test()
	{
		System.out.println("Hi this is test method in Parent Class");
	}
	
//	final public void test()
//	{
//		System.out.println("Hi this is test method in Parent Class");
//	}
	

}

public class _1_FinalKeyword_2 extends Parent {
	
	@Override
	public void test()
	{
		System.out.println("Hi this is test method in Child Class");
	}
	
	public static void main(String[] args) {
		
		_1_FinalKeyword_2 ch = new _1_FinalKeyword_2();
		ch.test();
		
	}
}
