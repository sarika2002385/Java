public class Transport{

// default constructor

   public  String name;
 
   public  int number;
   public  String locationto;
   public  int    otp;
   public  String locationfrom;
   public  float price;
   
   public Transport(){
		System.out.println("no arguments present");
	}
	
    public Transport(String name,int number){		
		 this.name=name;
		 this.number=number;
    }
	
	public Transport(int otp,String locationto){		
		 this.otp=otp;
		 this.locationto=locationto;
    }
	
	public Transport(float price,String locationfrom){		
		 this.price=price;
		 this.locationfrom=locationfrom;
		 
		 System.out.println("name is:"+name);
	     System.out.println("number is:"+number);
		 System.out.println("otp is:"+otp);
		 System.out.println("location is:"+locationto);
		 System.out.println("location is:"+locationfrom);
		 System.out.println("price is:"+price);
	}
}