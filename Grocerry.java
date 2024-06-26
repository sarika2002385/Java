public class Grocerry{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     String nameofdryfruits[]={"cashew","Almond","Dates","Walnut"};
     int numberoffruits[]={10};
	 boolean iseatable[]={true}; 
     
	 
	 //Display the each arrays
	 for(int i=0;i<nameofdryfruits.length; i++){
	 System.out.println("nameofdryfruits is :"+nameofdryfruits[i]);
	 }
	 
	 for(int i=0;i<numberoffruits.length; i++){
	 System.out.println("numberoffruits is :"+numberoffruits[i]);
	 
	 }
	 for(int i=0;i<iseatable.length; i++){
	 System.out.println("is eatable:"+iseatable[i]);
	 
	 } 
	}
}