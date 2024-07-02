public class Biriyani{
  public static void ingridients(String names){
   System.out.println("ingridients are:"+names);
  
  }
  public static void ingridients(String names,int review){
	  if(review<10)
   System.out.println("review is:"+review);
  }else{
	  System.out.println("review is:"+review);
  }
  
  public static void ingridients(String names,int review){
	  if(review>5)
   System.out.println("review is:"+review);
   }else{
System.out.println("review is:"+review);
	   
   }
   
   public static void ingridients(String names,int review,int price){
   System.out.println("price is:"+price);
   
   }
   public static void ingridients(String names,int review,int price,String quality){
   System.out.println("quality is:"+quality);
   }
   
  
}