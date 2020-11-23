public class Sum{

    public static void main(String[] args){

	double sums = sumNum(1,2);
	sumNum(1,2.3);
	sumNum(1,2,3,4);
	//sumNum(1,2);
	//sumNum(1,2,3);
	//sumNum(1,2,3,4);
	//	System.out.println(sum);
    }

    public static double sumNum(double a, double b){
	System.out.println(a+"+"+b+"="+sums);
	return a+b;
    }
    public static double sumNum(double a, double b, double c){
	System.out.println(a+"+"+b+"+"+c+"=");
	return a+b+c;
    }   
    public static double sumNum(double a, double b, double c, double d){
	System.out.println(a+"+"+b+"+"+c+"+"+d+"=");
	return a+b+c+d;
    }   

}