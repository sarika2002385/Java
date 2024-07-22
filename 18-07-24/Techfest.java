public class Techfest{

// default constructor

   public  String fest_name;
 
   public  int no_of_particepants;
   public  String location;
   public  boolean isfee;
   public  String company_name;
   public  float ticket_price;
   
   public Techfest(){
		System.out.println("no arguments present");
	}
	
    public Techfest(String fest_name,int no_of_particepants){		
		 this.fest_name=fest_name;
		 this.no_of_particepants=no_of_particepants;
    }
	
	public Techfest(boolean isfee,String location){		
		 this.isfee=isfee;
		 this.location=location;
    }
	
	public Techfest(String company_name,float ticket_price){		
		 this.company_name=company_name;
		 this.ticket_price=ticket_price;
		 
		 System.out.println("name is:"+fest_name);
	     System.out.println("number is:"+no_of_particepants);
		 System.out.println("location is:"+location);
		 System.out.println("fee is:"+isfee);
		 System.out.println("company is:"+company_name);
		 System.out.println("price is:"+ticket_price);
	}
}