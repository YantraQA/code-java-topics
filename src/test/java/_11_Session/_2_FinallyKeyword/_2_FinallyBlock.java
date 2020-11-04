package _11_Session._2_FinallyKeyword;

import java.io.ObjectInputStream.GetField;

public class _2_FinallyBlock {

	public static void main(String[] args) 
	{
		int p = getNumber();
		System.out.println(p);
		
	}
	
	public static int getNumber()
	{
		int a = 10;
		int b = 20;
		
		try 
		{
			int c = a + b;
			return c;
		} 
		catch (Exception e) 
		{
			return -1;
		}
		finally 
		{
			System.out.println("Bye .... ");
		}
		
	}
	
	// ------------------------------------------------------------------------
	
//	public static int getNumber()
//	{
//		int a = 10;
//		int b = 20;
//		
//		try 
//		{
//			int c = a + b;
//			return c;
//		} 
//		catch (Exception e) 
//		{
//			return -1;
//		}
//		finally 
//		{
//			System.out.println("Bye .... ");
//			return 100; // by this return keyword the actual return number is overridden so dont use return in finally
//						// other wise it will change the actual return of the method
//		}
//		
//	}
	
	// ------------------------------------------------------------------------
	
//	public static int getNumber()
//	{
//		int a = 10;
//		int b = 0;
//		
//		try 
//		{
//			int c = a / b;
//			return c;
//		} 
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			return -1;
//		}
//		finally 
//		{
//			System.out.println("Bye .... ");
//			return 100; // by this return keyword the actual return number is overridden so dont use return in finally
//						// other wise it will change the actual return of the method
//		}
//		
//	}
	
	// ------------------------------------------------------------------------
	
//	public static int getNumber()
//	{
//		int a = 10;
//		int b = 0;
//		
//		try 
//		{
//			int c = a / b;
//			return c;
//		} 
//		catch (NullPointerException e) 
//		{
//			return -1;
//		}
//		finally 
//		{
//			System.out.println("Bye .... ");
//			//return 100; // by this return keyword the actual return number is overridden so dont use return in finally
//						// other wise it will change the actual return of the method
//		}
//		
//	}
	
	// ------------------------------------------------------------------------
	
//	public static int getNumber()
//	{
//		int a = 10;
//		int b = 0;
//		
//		try 
//		{
//			int c = a / b;
//			return c;
//		} 
//		catch (NullPointerException e) 
//		{
//			return -1;
//		}
//		finally 
//		{
//			System.out.println("Bye .... ");
//			return 100; // by this return keyword the actual return number is overridden so dont use return in finally
//						// other wise it will change the actual return of the method
//		}
		
	}


	
