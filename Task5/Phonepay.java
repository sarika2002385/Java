public class Phonepay{
 public static void getPhonepay(){
   int amount=40000; 
  
   if(amount>30000){
   System.out.println("phonepay is working ");
   }else{
   System.out.println("phonepay is not working");
   }
  
 }
 


public static void getBankname(String name){
    name="SBI";
    
   if(name=="SBI"){
   System.out.println("account exit:" +name);
   }else{
   System.out.println("account is not exit" +name);
   }
}


public static String acc_number(){
    int number = 245678;
    
   if(number==12345){
   System.out.println("acc_number is valid:" +number);
   return "valid";
   }else{
   System.out.println("acc_number is invalid:" +number);
   return "invalid";
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
 
