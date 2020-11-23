public class NumberPalindrome{

    public static void main(String[] args){

	//	isPalindrome(12321);
	System.out.println("The number is a "+isPalindrome(12321)+" palindrome");
    }
    public static boolean isPalindrome(int number){

	int reverse=0;
	int temp=number;
	while(number!=0){
	    int lastDigit=number%10;
	    reverse=reverse*10+lastDigit;
	    number=number/10;
	}
	if(temp==reverse){
	    return true;
	}else{
	    return false;
	}
    }
}