public class Weekend{
   
   public static void sleep(){
   
     System.out.println("12 hours");
	 }
	 
	 public static void shopping(){
	 //local variables
	  
	   String brand="zara";
	   int price=1000;
	  
	  System.out.println("brand is:" +brand);
	  System.out.println( "price:" +price);
	  
	 public static void getGst(int price){
		  System.out.println( "get Gst for price:" +price);
		  
	  double totalprice=Weekend.gst*price+price;
	      System.out.println( " total price is:" + totalprice);
	  
	  
		  
		  
	  }
	 
	 }







}