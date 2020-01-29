package com.Ani.function;

public class FinalClassDemo {
	public static void main(String[] args) {
		AddtionalInfo ai = new AddtionalInfo();
		ai.getInfo();
	}

	
	
	
}

final class Info {
	void getInfo() {
		System.out.println("Info.getInfo()");
	}
}

class AddtionalInfo {
	void getInfo() {
		Info i = new Info();
		i.getInfo();
	}
}
