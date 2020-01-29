package com.Ani.misc;

public class ObjectDemo {

	public static void main(String[] args) {
		Mobile m = new Mobile();
			m.getType();
			m.screenSize();
			m.toString();
			Object mob = new Mobile();
			Keyboard mobKey = new Mobile();
	}

}


class Keyboard{
	void getType(){
		
	}
}


class Mobile extends Keyboard{
	void screenSize() {
		
	}
}