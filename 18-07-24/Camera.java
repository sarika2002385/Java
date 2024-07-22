public class Camera{
//instance varables
   public  String c_name;
 
   public  int cost;
   public  float rate;
   public  int size;
   public  boolean quality;
   public  String user ;
   
   public Camera(int cost){
       this(4.2f);
	   this.cost=cost;
	   System.out.println("cost is:"+cost);
   }
   
   public Camera(float rate){
       this(true);
	   this.rate=rate;
	   System.out.println("rate is:"+rate);
	   
   }
	public Camera(int size){
       this(3000);
	   this.size=size;
	   System.out.println("size is:"+size);
	   
   }
   public Camera(boolean quality){
       this("sarika");
	   this.quality=quality;
	   System.out.println("quality is:"+quality);
	}
	
	public Camera(String user){
       this("sarika");
	   this.user=user;
	   System.out.println("user is:"+user);
	}

    
    
 


}