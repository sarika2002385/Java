public class Business1{

// Instance variables

   public String Business_name;
   public int    start_year;
   public float  Business_rate;
   public short  num_emp;
   public String[]name_of_business;
   
   public Business1(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public Business1(String Business_name,int start_year, short num_emp, String[] name_of_business,float Business_rate){
		
		 this.Business_name=Business_name;
		 this.start_year=start_year;
         this.Business_rate=Business_rate;
		 this.num_emp=num_emp;
		 this.name_of_business=name_of_business;
		 
		 System.out.println("business name is:"+Business_name);
		 System.out.println("started year:"+start_year);
         System.out.println("rate is:"+Business_rate);
		 System.out.println("employee num:"+num_emp);
		
		
		for(int i=0;i<name_of_business.length;i++){
			System.out.println("name of business:"+name_of_business[i]);
		}
		 
	}
}


   

