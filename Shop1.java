public class Shop1{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberofworkers[]={100};
     char size[]={'s','m','x','l'};
	 String costumes[]={"shirts","kurtis","jeans"}; 
     
	 
	 //Display the each arrays
	 for(int i=0;i<numberofworkers.length; i++){
	 System.out.println("number of workers are:"+numberofworkers[i]);
	 }
	 
	 for(int i=0;i<size.length; i++){
	 System.out.println("size is :"+size[i]);
	 
	 }
	 for(int i=0;i<costumes.length; i++){
	 System.out.println("costumes name are:"+costumes[i]);
	 
	 } 
	}
}