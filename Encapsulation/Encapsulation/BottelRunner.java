public class BottelRunner{
  public static void main(String args[]){
  
  
  Bottel bottel=new Bottel();
  
   bottel.setName("biseleri");
   if(bottel.getName()=="biseleri" && bottel.getName()=="filter"){
   System.out.println("name:"+bottel.getName());
   System.out.println("name is matching");
   }else{
   System.out.println("not match");
   }
    
	
   bottel.setPrice(250);
   if(bottel.getPrice()>25 && bottel.getPrice()<50){
	   System.out.println("price is less");
   }else{
      System.out.println("price is high");
   }
      System.out.println("price:"+bottel.getPrice());
   
   
   bottel.setBrand("milton");
    System.out.println("brand :"+bottel.getBrand());
   
   
   bottel.setColour("black");
    System.out.println("colour:"+bottel.getColour());
   
   
  }

}
