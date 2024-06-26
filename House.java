public class House{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberofrooms[]={5};
     String nameofhouse[]={"nivas"};
	 boolean isforsale[]={false};
	 float inch[]={3.00f};
	 int Houserent[]={3000};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberofrooms.length; i++){
	 System.out.println("number of rooms are :"+numberofrooms[i]);
	 }
	 
	 for(int i=0;i<nameofhouse.length; i++){
	 System.out.println("name of house :"+nameofhouse[i]);
	 
	 }
	 
	 for(int i=0;i<isforsale.length; i++){
	 System.out.println("is for sale:"+isforsale[i]);
	 }
	 
	 for(int i=0;i<inch.length; i++){
	 System.out.println("inch is:"+inch[i]);
	 }
	 
	 for(int i=0;i<Houserent.length; i++){
	 System.out.println("Houserent is:"+Houserent[i]);
	 
	 } 
	}
  }