package com.Aniket.types;

public class CanonPrinter implements Printable {

	@Override
	public boolean canPrintPhotos() {
		System.out.println("CanonPrinter.canPrintPhotos()");
		return false;
	}

}
