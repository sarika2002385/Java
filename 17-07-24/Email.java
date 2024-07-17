public class Email{

// default constructor

   public static String username[];
 
   public static int    createddate;
   public static float  emailrate;
   public static byte   user_age;
   public static short  no_of_mails;
   
   public Email(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public Email(String[] username,int createddate, short no_of_series, byte user_age,float emailrate){
		
		 this.username=username;
		 this.createddate=createddate;
         this.emailrate=emailrate;
		 this.user_age=user_age;
		 this.no_of_mails=no_of_mails;
		 
		 System.out.println("no_of_mails is:"+no_of_mails);
		 System.out.println("created date is:"+createddate);
         System.out.println("email rate is:"+emailrate);
		 System.out.println("user age is:"+user_age);
		
		
		for(int i=0;i<username.length;i++){
			System.out.println("name of business:"+username[i]);
		}
		 
	}
}

   