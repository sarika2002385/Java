public class Bottel{
 
 private String type;
 private int price;
 private String brand;
 private String colour;

 
 public Bottel(){
   System.out.println("no argument constructor");
 }
 
 public Bottel(String type,int price,String brand,String colour){
  this.type=type;
  this.price=price;
  this.brand=brand;
  this.colour=colour;
 
 }
 
 public void setName(String type){
   this.type=type;
 }
 
 public String getName(){
   return this.type;
 }
 
 public void setPrice(int price){
   this.price=price;
  }
  
  public int getPrice(){
   return this.price;
  }
  public void setBrand(String brand){
   this.brand=brand;
   }
   public String getBrand(){
    return this.brand;
  }
  public void setColour(String colour){
   this.colour=colour;
   }
   
   public String getColour(){
     return this.colour;
   }
 
   
   
  

   
}
  
  
 
 

