public class Primenumbers{
  public static void main(String args[]){
	int count=0;
    int num=4;
	if(num<2){
	  System.out.println("not a prime number");

	for(int i=2;i<=num;i++)
	   if(num%i==0){
	   count++;
	
	}
	}else{
	 System.out.println("its a prime number");
	
	}
	
	
  
  }


}