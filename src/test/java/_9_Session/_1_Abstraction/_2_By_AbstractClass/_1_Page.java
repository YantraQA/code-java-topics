package _9_Session._1_Abstraction._2_By_AbstractClass;

public abstract class _1_Page {
	
	// Ques - Can abstract class be final
	// Ans - No, a class can be either abstract or final not both
	
	
	public _1_Page() {
		System.out.println("Page Const.....");
	}

	public abstract void title(); // abstract method

	public abstract void url(); // abstract method

	public abstract void footerLinks(); //abstract method

	
	public void logo() // Non abstract method
	{
		System.out.println("Page -- logo");
	}
	
	public final void privacyPolicy() // Non abstract final method - to avoid overriding the method
	{
		System.out.println("Page -- privacyPolicy");
	}
	
	

	// partial abstraction -- 0 to 100% abstraction with Abstract Class
	// Full abstraction -- 100% abstraction with Interface


}
