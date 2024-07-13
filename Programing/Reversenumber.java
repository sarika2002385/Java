public class Reversenumber{
    public static void main(String args[]){
	long number=9876543210L;
	long reverse=0;
	
	 
	 while(number!=0){
	  long rem=number%10;
	  reverse=reverse*10+rem;
	  System.out.println("reverse:" +reverse+" "+"rem is:" +rem);
	  number=number/10;
	 }
	  
	  
	  System.out.println("reverse number is:"+number);
	  
	 
	 
	 }

    
  
  }



