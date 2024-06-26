public class Dmart{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberofitems[]={1000};
     boolean isopen[]={true};
	 String itemsname[]={"grocerry","fruits","snacks"}; 
     
	 
	 //Display the each arrays
	 for(int i=0;i<numberofitems.length; i++){
	 System.out.println("number of items are:"+numberofitems[i]);
	 }
	 
	 for(int i=0;i<isopen.length; i++){
	 System.out.println("store is open:"+isopen[i]);
	 
	 }
	 for(int i=0;i<itemsname.length; i++){
	 System.out.println("items names are:"+itemsname[i]);
	 
	 } 
	}
}