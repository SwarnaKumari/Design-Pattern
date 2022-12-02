package singletondesignpattern;
//early initialization
public class singleton {
	//
	private static final singleton obj=new singleton();
	private singleton()
	{
		//private constructor
	}
	public static singleton getInstance()
	{
		return obj;
	}
	

}
