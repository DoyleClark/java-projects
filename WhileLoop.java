public class WhileLoop{

    public static void main(String[] args){

	/*int count =6;
	while(count != 6){
	    System.out.println("Count value is "+count);
	    count++;
	}
	count=1;
	while(true){
	    if(count==6){
		break;
	    }
	    System.out.println("Count value is "+count);
	    count++;
	}
	for(int i=6; i!+6:i++){
	    System.out.println("Count value is "+count);
	}
		     
	count=6;
	do{
	    System.out.println("Count value is "+count);
	    count++;

	    if(count>100){
		break;
	    }
	}while(count!=6);
	}*/
	/*
	int num = 4;
	int finishNum = 20;

	while(num<=finishNum){
	    num++;
	    if(!isEvenNumber(num)){
		continue;
	    }
	    System.out.println("Even number "+num);
	}
	}*/
       int num = 4;                                                                     
       int finishNum = 20;                                                                
       int evenNumbersFound = 0;
                                                     
        while(num<=finishNum){                                                            
            num++;                                                                        
            if(!isEvenNumber(num)){                                                       
                continue;                                                                 
            }
	    System.out.println("Even number "+num);

	    evenNumbersFound++;
	    if(evenNumbersFound>=5){
		break;
	    }
        }
	System.out.println("Total even number found = "+evenNumbersFound);
    }

	public static boolean isEvenNumber(int num){

	    if((num%2)==0){
		return true;
	    }else{
		return false;
	    }
	}
}