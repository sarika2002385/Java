public class GoogleDrive{

// default constructor

   public static String[] Drivename;
 
   public static int    startedyear;
   public static float  Driverate;
   public static byte   no_of_users;
   public static short  no_of_followers;
   
   public GoogleDrive(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public GoogleDrive(String[] Drivename,int startedyear, short no_of_followers, byte no_of_users,float Driverate){
		
		 this.Drivename=Drivename;
		 this.startedyear=startedyear;
         this.Driverate=Driverate;
		 this.no_of_users=no_of_users;
		 this.no_of_followers=no_of_followers;
		 
		 System.out.println("started year is:"+startedyear);
		 System.out.println("drive rate is:"+Driverate);
         System.out.println("no of users:"+no_of_users);
		 System.out.println("no of followers:"+no_of_followers);
		
		
		for(int i=0;i<Drivename.length;i++){
			System.out.println("name of business:"+Drivename[i]);
		}
		 
	}
}

   
   

