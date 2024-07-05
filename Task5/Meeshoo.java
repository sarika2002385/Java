public class Meeshoo{
   public static void meeshooinfo(){
    
   String search ="cloth"; 
  
   if(search=="dress"){
   System.out.println("search is available:"+search);
   }else{
   System.out.println("search is not available:"+search);
   }
  
 }
 


public static void price(int price){
     price=2000;
    
   if(price==2000){
   System.out.println("price is :" +price);
   }else{
   System.out.println("price is:" +price);
   }
}


public static float rate(){
      float rate = 4.5f;
    
   if(rate>4){
   System.out.println("rate is:" +rate);
   return 4.2f;
   }else{
   System.out.println("rate is:" +rate);
   return 1;
   }
}

public static boolean quality(boolean isgood){
     isgood=true;
    
   if(isgood==true){
   System.out.println("quality is good :" +isgood);
   return true;
   }else{
   System.out.println("quality is bad:" +isgood);
   return false;
   }



}
}
 
  
 
 
