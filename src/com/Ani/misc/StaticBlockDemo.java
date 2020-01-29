package com.Ani.misc;

public class StaticBlockDemo {

	public static void main(String[] args) {
//		Check c=new Check();
//		
//		Check c2=new Check();
//		
//		Check c3=new Check();
//		
//		Check c4=new Check();
		
		Check c=new Check();
	}

}


class Check{
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Check object getting created");
	}

	public Check() {
		System.out.println("Check,CHeck");
	}
	
	
}

