public class Tress{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberoftress[]={500};
     String nameoftrees[]={"neem","mango","coconut","palm","pine"};
	 boolean iscuttable[]={true};
	 float inch[]={3.5f,3.6f,5.1f,4.1f,6.0f};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberoftress.length; i++){
	 System.out.println("number of tress are :"+numberoftress[i]);
	 }
	 
	 for(int i=0;i<nameoftrees.length; i++){
	 System.out.println("name of tress are :"+nameoftrees[i]);
	 
	 }
	 
	 for(int i=0;i<iscuttable.length; i++){
	 System.out.println("is cuttable:"+iscuttable[i]);
	 }
	 
	 for(int i=0;i<inch.length; i++){
	 System.out.println("inch is:"+inch[i]);
	 
	 } 
	}
}