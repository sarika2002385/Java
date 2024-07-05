public class Amazon{
   public static void getDetails(){
    int rate=4; 
  
   if(rate>4){
   System.out.println("rate is good");
   }else{
   System.out.println("rate is bad");
   }
  
 }
 


public static void getprice(int price){
    price=10000;
    
   if(price==10000){
   System.out.println("price is high:" +price);
   }else{
   System.out.println("price is low" +price);
   }
}


public static String clothquality(){
    String quality = "good";
    
   if(quality=="good"){
   System.out.println("quality is good:" +quality);
   return "good";
   }else{
   System.out.println("quality is low" +quality);
   return "low";
   }
}

public static String gettypes(String types){
    types = "saree";
    
   if(types=="saree"){
   System.out.println("materials are available:" +types);
   return "saree";
   }else{
   System.out.println("materials are not available:" +types);
   return "not available";
   }



}
}