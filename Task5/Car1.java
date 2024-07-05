public class Car1{
   public static void getCarDetails(){
    
   String car_name ="audi"; 
  
   if(car_name=="swift"){
   System.out.println("car is not present:"+car_name);
   }else{
   System.out.println("car is present:"+car_name);
   }
  
 }
 


public static void price(int price){
     int amount=100000;
    
   if(amount==100000){
   System.out.println("amount is:" +price);
   }else{
   System.out.println("amount is:" +price);
   }
}


public static String color(){
     String color ="white";
    
   if(color=="red"){
   System.out.println("color is bad:" +color);
   return "white";
   }else{
   System.out.println("color is good:" +color);
   return "red";
   }
}

public static int reviwe(int reviwe){
     reviwe=3;
    
   if(reviwe>2){
   System.out.println("reviwe is :" +reviwe);
   return 2;
   }else{
   System.out.println("reviwe is:" +reviwe);
   return 0;
   }



}
}
 