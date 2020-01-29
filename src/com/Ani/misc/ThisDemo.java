package com.Ani.misc;

public class ThisDemo {

	int count;
	
	public static void main(String[] args) {
	ThisDemo tc = new ThisDemo();
	tc.check();
	}
	
	void check() {
		System.out.println("Count value : " + count);
		setCount(27);
		System.out.println("Updated Count : " + count);
	}

	private void setCount(int count) {
		this.count=count;
	}
	
}
