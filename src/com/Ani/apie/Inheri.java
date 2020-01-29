package com.Ani.apie;

public class Inheri {

	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.add(20,30);
	}

}

class Calc extends Stdcal{
	void add(int first,int second) {
		
		System.out.println((first + first));
	}
}

class Stdcal extends Scical{
	void add(int first,int second) {
	
		System.out.println((first + second));
	}
}
class Scical{
	void add(int first,int second) {
		System.out.println((first + second + first));
	}
}
