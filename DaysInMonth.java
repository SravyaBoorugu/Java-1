package practice;

public class DaysInMonth {

	public static void main(String[] args) {
		String month = args[0];
		switch(month){
		case "january"  :
		case "may"      :          
		case "march"	:
		case "july"     :
		case "august"   : 
		case "october"  : 
		case "december" : System.out.println("31 days");
			              break;
		case "february" : System.out.println("28 days");
		case "april"    : 
		case "june"     : 
		case "september":
		case "november" : System.out.println("30 days");
		                  break;
		default         : System.out.println("Invalid Input");
		}

	}

}
