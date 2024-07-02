public class ShoppingDetails{
	public static final double gst=0.18;
  public static void type(String shoptype ){
  
  System.out.println("shoping type is:" +shoptype);
  }
  
  
  public static void price(int pricee){
   System.out.println("get GST for price:"+ price);
   double totalprice=(Shopping.gst*pricee)+pricee;
   System.out.println("total price is:"+totalprice);
  }
   
   
   public static void item(String itemName,String type){
   System.out.println("shopped itemName is:"+itemName+ ","+ "the shopping type:"+type);
   }
   
   public static void details(String Type,string itemName,int totalprice){
   System.out.println("shopping details are:"+type+ ","+"the shopping item is:"+item+","+"the shopping totalprice is:"+gstprice);
   }
   
   
   
   
   }
   
   
   
  
  
