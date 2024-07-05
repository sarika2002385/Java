public class Googlepay{
  public static void gpaydetails(){
    String task ="sendmoney"; 
  
   if(task=="sendmoney"){
   System.out.println("gpay is working ");
   }else{
   System.out.println("gpay is not working");
   }
  
 }
 


public static void acc_holdername(String name){
    name="sarika";
    
   if(name=="sarika"){
   System.out.println("account exit:" +name);
   }else{
   System.out.println("account is not exit" +name);
   }
}


public static int amount(){
     int amount = 2000;
    
   if(amount==2000){
   System.out.println("amount is:" +amount);
   return 2000 ;
   }else{
   System.out.println("amount is:" +amount);
   return 0;
   }
}

public static boolean transfer(boolean transfer){
     transfer=true;
    
   if(transfer==true){
   System.out.println("transfer is sucessful:" +transfer);
   return false;
   }else{
   System.out.println("transfer is unsucessful:" +transfer);
   return false;
   }



}
}
 

  
  
  