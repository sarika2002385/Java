public class Birds{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     String nameofbirds[]={"parrot","sparrow","crow"};
     boolean issoundable[]={true,true,true};
	 String colour[]={"green","grey","black"}; 
     
	 
	 //Display birds of each arrays
	 for(int i=0;i<nameofbirds.length; i++){
	 System.out.println("birds names are:"+nameofbirds[i]);
	 }
	 
	 for(int i=0;i<issoundable.length; i++){
	 System.out.println("birds sounds are:"+issoundable[i]);
	 
	 }
	 for(int i=0;i<colour.length; i++){
	 System.out.println("birds colour are:"+colour[i]);
	 
	 } 
	}
}
	