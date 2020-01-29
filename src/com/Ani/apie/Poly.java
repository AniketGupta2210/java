package com.Ani.apie;

public class Poly {

	public static void main(String[] args) {
	 calcu ic = new compound();
	 ic.cal("Aniket");
	 ic.cal(100);
	}

}
class compound extends calcu
	{
		@Override
		void cal (int p) {
			System.out.println("compound.cal()");
		}
	}

class calcu{
	void cal(int p) {
		System.out.println("calcu.cal(integer)");
	}
	void cal(String name) {
		System.out.println("calcu.cal(String)");
}
}