public class Lands{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberoflands[]={2};
     String name[]={"crystal"};
	 boolean issale[]={false};
	 float inch[]={5.00f};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberoflands.length; i++){
	 System.out.println("number of lands are :"+numberoflands[i]);
	 }
	 
	 for(int i=0;i<name.length; i++){
	 System.out.println("name of lands :"+name[i]);
	 
	 }
	 
	 for(int i=0;i<issale.length; i++){
	 System.out.println("is sale:"+issale[i]);
	 }
	 
	 for(int i=0;i<inch.length; i++){
	 System.out.println("inch is:"+inch[i]);
	 
	 } 
	}
}