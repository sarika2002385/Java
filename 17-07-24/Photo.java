public class Photo{

// default constructor

   public static String name[];
 
   public static int    no_of_pictures;;
   public static float  photo_size;
   public static byte   picsrange;
   public static short  no_of_peoples;


public Photo(){
		System.out.println("no arguments present");
	}
	
   
   
	
	public Photo(String[] name,int no_of_pictures, short no_of_peoples, byte picsrange,float photo_size){
		
		 this.no_of_pictures=no_of_pictures;
		 this.photo_size=photo_size;
         this.picsrange=picsrange;
		 this.no_of_peoples=no_of_peoples;
		 
		 System.out.println("number of picture is:"+no_of_pictures);
		 System.out.println("photo size is:"+photo_size);
         System.out.println("pic range:"+picsrange);
		 System.out.println("number of people:"+no_of_peoples);
		
		
		for(int i=0;i<name.length;i++){
			System.out.println("name of business:"+name[i]);
		}
		 
	}
}

   
   

