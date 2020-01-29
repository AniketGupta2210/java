package com.Ani.misc;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String inputday=args[0];
		System.out.println("Entered Day : " + inputday);
		
		Days convertedInput = mappingDaysToEnums(inputday);
		
		
		switch (convertedInput) {
		case MONDAY:
			System.out.println("Working");
			break;

		case TUESDAY:
			System.out.println("Working");
			break;

		case WEDNESDAY:
			System.out.println("Working");
			break;

		case THURSDAY:
			System.out.println("Working");
			break;

		case FRIDAY:
			System.out.println("Working");
			break;

		case SATDAY:
			System.out.println("Holiday");
			break;

		case SUNDAY:
			System.out.println("Holiday");
			break;

		default:
			System.out.println("Please provide correct value");
			break;
		}
	}

	private static Days mappingDaysToEnums(String day) {
		
		Days days = Days.MONDAY;
		
		String dayAgain = day.toLowerCase();
		switch (dayAgain) {
		case "mon":
			days = Days.MONDAY;
			break;

		case "tue":
			days = Days.TUESDAY;
			break;

		case "wed":
			days = Days.WEDNESDAY;
			break;

		case "thurs":
			days = Days.THURSDAY;
			break;

		case "fri":
			days = Days.FRIDAY;
			break;

		case "sat":
			days = Days.SATDAY;
			break;

		case "sun":
			days = Days.SUNDAY;
			break;

		
		default:
			break;
		}
		return days;
	}

}


enum Days{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATDAY,SUNDAY}