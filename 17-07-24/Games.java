public class Games{

// default constructor

   public static String Gamename;
 
   public static int    gamescore;
   public static float  gamerate;
   public static byte   no_of_players;
   public static short  no_of_levels=20;
   
   public Games(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public Games(String[] Gamename,int gamescore, short no_of_levels, byte no_of_players,float gamerate){
		
		 this.gamescore=gamescore;
		 this.gamerate=gamerate;
         this.no_of_players=no_of_players;
		 this.no_of_levels=no_of_levels;
		 
		 System.out.println("game score is:"+gamescore);
		 System.out.println("game rate is:"+gamerate);
         System.out.println("num of player is:"+no_of_players);
		 System.out.println("number of level:"+no_of_levels);
		
		
		for(int i=0;i<Gamename.length;i++){
			System.out.println("name of business:"+Gamename[i]);
		}
		 
	}
}

   
   
   