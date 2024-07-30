public class Sweet{

 public String name;
 public int price;
 public boolean isTaste;
 
 
 public void sweetInfo(){
	   this("jamun");
       this(300);
	   //this.name=name;
	   System.out.println("no argument constructor");
   }
   
   public void sweetInfo(String name,int price){
      // this("jamun");
	   this.name=name;
	   this.price=price;
	   System.out.println("name:" +name +"price is:"+price);
	   
   }
	public int sweetInfo(){
       this(true);
	   
   }
   public boolean sweetInfo(boolean isTaste,int price){
       this.price=price;
	   this.isTaste=isTaste;
	   System.out.println("is:"+isTaste + "price:"+price);
	}
}
	
	