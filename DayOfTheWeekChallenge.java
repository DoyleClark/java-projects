public class DayOfTheWeekChallenge{

    public static void main(String[] args){

	printDayOfTheWeek(-1);
	printDayOfTheWeek(0);
	printDayOfTheWeek(1);
	printDayOfTheWeek(2);
	printDayOfTheWeek(3);
	printDayOfTheWeek(4);
	printDayOfTheWeek(5);
	printDayOfTheWeek(6);
	printDayOfTheWeek(7);
    }
    private static void printDayOfTheWeek(int day){

	switch(day){
	case 0:
	    System.out.println("The day is Sunday");
	    break;
	case 1:
            System.out.println("The day is Monday");
	    break;
	case 2:
            System.out.println("The day is Tuesday");
	    break;
	case 3:
            System.out.println("The day is Wednesday");
	    break;
	case 4:
            System.out.println("The day is Thursday");
	    break;
	case 5:
            System.out.println("The day is Friday");
	    break;
	case 6:
	    System.out.println("The day is Saturday");
	    break;
	default:
	    System.out.println("Invalid day");
	    break;
	}

	if(day<0 || day>6){
	    System.out.println("Invalid day");
	}
	else if(day==0){
	    System.out.println("The day is Sunday");
	}
	else if(day==1){
	    System.out.println("The day is Monday");
	}
	else if(day==2){
            System.out.println("The day is Tuesday");
	}
	else if(day==3){
            System.out.println("The day is Wednesday");
	}
	else if(day==4){
            System.out.println("The day is Thursday");
	}
	else if(day==5){
            System.out.println("The day is Friday");
	}else{
            System.out.println("The day is Saturay");
	}
    }
}