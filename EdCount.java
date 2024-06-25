public class EdCount{
    public static void main(String args[]){
	int[]numbers = {2,8,5,9,1,23,14,12};
	int evencount=0;
	int oddcount=0;
	
	for(int i=0;i<numbers.length;i++){
	if(numbers[i]%2==0){
		evencount++;
	System.out.println("even numbers are:"+numbers[i]);
	}else{
		oddcount++;
	System.out.println("odd numbers are:"+numbers[i]);
	    }
	  }
 
     System.out.println("count of even numbers:"+evencount++);
	 System.out.println("count of odd numbers:"+oddcount++);
	}	
}

	









