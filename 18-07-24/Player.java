public class Player{

// default constructor

   public  String p_name;
 
   public  int prize_amount;
   public  float height;
   public  int player_age;
   public  String game_name;
   public  int score;
   
   public Player(){
	    this();
		System.out.println("no arguments present");
		
	}
	
    public Player(String p_name,int prize_amount){	
	     this("virat");
		 this(2000);
		 this.p_name=p_name;
		 this.prize_amount=prize_amount;
    
    }
	
	public Player(float height,int player_age){	
	     this(3.4);
		 this(35);
         
		 this.height=height;
		 this.player_age=player_age;
		 
    }
	
	public Player(int score,String game_name){
         this(200);
         this("cricket");		 
		 this.score=score;
		 this.game_name=game_name;
		 
		 System.out.println("player name:"+p_name);
	     System.out.println("prize  is:"+prize_amount);
		 System.out.println("height is:"+height);
		 System.out.println("age is:"+player_age);
		 System.out.println("game is:"+game_name);
		 System.out.println("score is:"+score);
	}
}