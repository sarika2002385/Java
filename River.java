public class River{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberofRivers[]={200};
     boolean isfull[]={false};
	 String Riversname[]={"ganga","kaveri","yamuna"}; 
     
	 
	 //Display the each arrays
	 for(int i=0;i<numberofRivers.length; i++){
	 System.out.println("number of Rivers are:"+numberofRivers[i]);
	 }
	 
	 for(int i=0;i<isfull.length; i++){
	 System.out.println("rivers is full:"+isfull[i]);
	 
	 }
	 for(int i=0;i<Riversname.length; i++){
	 System.out.println("Rivers name are:"+Riversname[i]);
	 
	 } 
	}
}