package day3;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//Example 1
		int noOfDay = 3;
		switch (noOfDay) {
		//if(noOfDay==1)
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Not a working day except for Anurag.");
			break;
		}
		
		String month = "Jun";
		
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("No. of days is 31");
			break;
		case "Feb":
			System.out.println("No. of days is 28");
			break;
		default:
			System.out.println("No. of days is 30`");
			break;
		}
		System.out.println("After Switch Statement");
	}
}
