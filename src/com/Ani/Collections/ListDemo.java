package com.Ani.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Float> appraisalRatings = new ArrayList<Float>(); //inbuilt functions and stored in same location
		appraisalRatings.add(3.21f);
		appraisalRatings.add(3.64f);
		appraisalRatings.add(2.31f);
		appraisalRatings.add(4.72f);

		System.out.println(appraisalRatings);

		appraisalRatings = new LinkedList<>(); //storage in different location
		appraisalRatings.add(2.75f);
		appraisalRatings.add(1.34f);
		appraisalRatings.add(4.22f);
		appraisalRatings.add(2.75f);
		
		System.out.println(appraisalRatings);
	}

}
