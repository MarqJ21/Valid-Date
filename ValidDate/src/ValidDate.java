import java.util.Scanner;

//Valid Date
//Marques Johnson

public class ValidDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a date in the format month/date/year");
		
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		String copyDate = date;
		Boolean mvalid = false;
		Boolean dvalid = false;
		Boolean yvalid = false;
		
		//gets the substxring of the text and redclares a new index position
		int workingIndex = copyDate.indexOf("/");
		String smonth = copyDate.substring(0,workingIndex);
		int imonth = Integer.parseInt(smonth);
		copyDate = copyDate.substring(workingIndex+1);
		
		workingIndex = copyDate.indexOf("/");
		String sday = copyDate.substring(0, workingIndex);
		int iday = Integer.parseInt(sday);
		copyDate = copyDate.substring(workingIndex+1);
		
		String syear = copyDate.substring(0,copyDate.length());
		int iyear = Integer.parseInt(syear);
		
		int leap = iyear % 4;
		
		//sets the boundries for the valid month input of the program
		if (imonth < 13 && imonth > 0) 
		{
			mvalid = true;
		} else {
			mvalid = false;
			System.out.println(date + " This month is not on the calendar. Has to be between 1 and 12.");
		}
		
		//sets the boundries for the valid day input of the program using a long if statement
		if (iday == 31 && imonth == 1) 
		{
			dvalid = true;
		}
		else if (iday == 31 && imonth == 3) {
			dvalid = true;
		}
		else if (iday == 31 && imonth == 5) {
			dvalid = true;
		}
		else if (iday == 31 && imonth == 7) {
			dvalid = true;
		}
		else if (iday == 31 && imonth == 8) {
			dvalid = true;
		}
		else if (iday == 31 && imonth == 10) {
			dvalid = true;
		}
		else if (iday == 31 && imonth == 12) {
			dvalid = true;
		}
		else if (iday == 30 && imonth == 4)
		{
			dvalid = true;
		}
		else if (iday == 30 && imonth == 6)
		{
			dvalid = true;
		}
		else if (iday == 30 && imonth == 9)
		{
			dvalid = true;
		}
		else if (iday == 30 && imonth == 11)
		{
			dvalid = true;
		}
		else if (iday == 29 && imonth == 3 && leap == 0) 
		{
			dvalid = true;
		}
		else if (iday < 28) 
		{
			dvalid = true;
		}
		else if (iday == 29) 
		{
			dvalid = false;
		}
		else 
		{
			dvalid = false;
			System.out.println(date + " is invalid, the day is wrong for this month.");
		}
		
		//sets the boundries for the valid year input of the program
		if (iyear < 2022 && iyear > 0) 
		{
			yvalid = true;
		}
		else 
		{
			yvalid = false;
			System.out.println(date + " is invalid, this year in not a leap year");
		}
		
		//this if statement evaluates if the date is a leap year by an if statement that checks the valid day, month, and if it is divisible by 4
		if (iday == 29 && leap == 0 && imonth == 2) 
		{
			System.out.println(date + " is a valid date!");
		}
		else if (leap != 0 && iday == 29 && imonth == 2)
		{
			System.out.println(date + " is invalid. This year is not a leap year.");
		}
		
		//The final evaluation of the month, day and year to see if it is a valid date, if all is true then the program says its a valid date
		if (mvalid == true && dvalid == true && yvalid == true)
		{
			System.out.println(date + " is a valid date!");
		}
	
	}

}
