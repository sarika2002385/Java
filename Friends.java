public class Friends{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberoffriends[]={10};
     String nameoffriends[]={"nitya","preeti","pooja","priya"};
	 float height[]={2.5f,3.0f,4.0f,2.0f};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberoffriends.length; i++){
	 System.out.println("number of friends are :"+numberoffriends[i]);
	 }
	 
	 for(int i=0;i<nameoffriends.length; i++){
	 System.out.println("name of friends :"+nameoffriends[i]);
	 
	 }
	 
	 for(int i=0;i<height.length; i++){
	 System.out.println("height is:"+height[i]);
	 }
	 
	 
	}
  }