public class NetFlix{

// default constructor

   public static String[] seriesname;
 
   public static int    Channelprice;
   public static float  Channelrate;
   public static byte   no_of_subscribers;
   public static short  no_of_series;
   
   public NetFlix(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public NetFlix(String[] seriesname,int Channelprice, short no_of_series, byte no_of_subscriber,float Channelrate){
		
		 this.seriesname=seriesname;
		 this.Channelprice=Channelprice;
         this.Channelrate=Channelrate;
		 this.no_of_subscribers=no_of_subscribers;
		 this.no_of_series=no_of_series;
		 
		 System.out.println("series number is:"+no_of_series);
		 System.out.println("channel price is:"+Channelprice);
         System.out.println("rate is:"+Channelrate);
		 System.out.println("subscriber is:"+no_of_subscribers);
		
		
		for(int i=0;i<seriesname.length;i++){
			System.out.println("name of business:"+seriesname[i]);
		}
		 
	}
}


   


   
   
   