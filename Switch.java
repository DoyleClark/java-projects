public class Switch{

    public static void main(String[] args){

	/*
	int value = 1;
	if(value==1){
	    System.out.println("Value was 1");
	}
	else if(value==2){
	    System.out.println("Value was 2"):
	}else{
	    System.out.println("Was not 1 or 2"):
	}
	*/

	int switchValue=3;
	char switchChar='A';
	String month="jaNUary";

	switch(switchValue){
	case 1:
	    System.out.println("Value was 1");
	    break;
	case 2:
	    System.out.println("Value was 2");
	    break;
	case 3: case 4: case 5:
	    System.out.println("Was a 3, or a 4, or a 5");
	    System.out.println("Actually is was a "+switchValue);
	    break;
	default:
	    System.out.println("Was not 1, 2, 3, 4, or 5");
	    break;
	}

	switch(switchChar){
	case 'A':
	    System.out.println("A was found");
	    break;
	case 'B':
	    System.out.println("B was found");
	    break;
	case 'C':
	    System.out.println("C was found");
	    break;
	case 'D':
	    System.out.println("D was found");
	    break;
	case 'E':
	    System.out.println("D was found");
	    break;
	default:
	    System.out.println("Could not find A, B, C, D, or E");
	}

	switch(month.toUpperCase()){
	case "JANUARY":
	    System.out.println("Jan.");
	    break;
	case "FEBRUARY":
	    System.out.println("Feb.");
	    break;
	default:
	    System.out.println("Not a valid month");
	    break;
	}
    }
}