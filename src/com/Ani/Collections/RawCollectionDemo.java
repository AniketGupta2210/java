package com.Ani.Collections;

import java.util.ArrayList;

public class RawCollectionDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(43);
		marks.add(87);
		marks.add(91);
		marks.add(51);
		marks.add(34);

		System.out.println(marks);

		for (Object object : marks) {

			Integer mark = (int) object;
			mark = mark + 10;
			System.out.println(mark);
		}

		for (Integer mark : marks) {

			mark = mark + 10;
			System.out.println(mark);
		}

	}

}
