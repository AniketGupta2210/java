package com.Aniket.types;

public class Idemo {

	public static void main(String[] args) {
		HPPrinter hp = new HPPrinter();
		System.out.println(hp.canPrintPhotos());
		
		CanonPrinter canon = new CanonPrinter();
		System.out.println(canon.canPrintPhotos());
		
		Printable p = new CanonPrinter();
		p = new HPPrinter();
		System.out.println(p.canPrintPhotos());
		
		Printable another = new Printable() {
			
			@Override
			public boolean canPrintPhotos() {
				System.out.println("Idemo.main(...).new Printable() {...}.canPrintPhotos()");
				return false;
			}
		};
		System.out.println(another.canPrintPhotos());
	}

}
