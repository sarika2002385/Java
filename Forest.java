public class Forest{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberofforests[]={300};
     String nameofforests[]={"amazon","congo","Tongass","Daintree"};
	 float Area[]={874.2f,892.4f,650.0f,8.0f};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberofforests.length; i++){
	 System.out.println("number of forest are :"+numberofforests[i]);
	 }
	 
	 for(int i=0;i<nameofforests.length; i++){
	 System.out.println("name of forest :"+nameofforests[i]);
	 
	 }
	 
	 for(int i=0;i<Area.length; i++){
	 System.out.println("Area is:"+Area[i]);
	 }
	 
	 
	}
  }