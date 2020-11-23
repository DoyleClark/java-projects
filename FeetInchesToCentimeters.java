 public class FeetInchesToCentimeters{

    public static void main(String[] args){

	//	calcFeetToInchesToCentimeters(6,0);
	double centimeters = calcFeetToInchesToCentimeters(6, 0);
	if(centimeters <0.0){
	    System.out.println("Invalid parameters");
	}
	calcFeetToInchesToCentimeters(157);
    }

    public static double calcFeetToInchesToCentimeters(double feet, double inches){

	if(feet < 0 || inches <0 || inches >12){
	    System.out.println("Invalid feet or inches parameters");
	    return -1;
	}
	
	double centimeters = (feet*12)*2.54;
	centimeters += inches*2.54;
	System.out.println(feet+" feet, " + inches + " inches= " + centimeters + "cm");
	return centimeters;

    }

    public static double calcFeetToInchesToCentimeters(double inches){

	if(inches <0){
	    System.out.println("Invalid feet or inches parameters");
	    return -1;
	}
	
	double feet = (int) inches/12;
	double remainingInches = (int) inches % 12;
	System.out.println(inches+" inches is equal to "+feet+" feet and "+remainingInches+" inches");
	return calcFeetToInchesToCentimeters(feet, remainingInches);
    }
}