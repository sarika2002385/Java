public class Programs{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int numberoflanguages[]={20};
     String nameoflanguages[]={"python","java","ruby","html","css"};
	 boolean isreadable[]={true};
	 float version[]={2.1f,2.2f,3.1f,4.1f};
      
	 
     //Display the each arrays
	 for(int i=0;i<numberoflanguages.length; i++){
	 System.out.println("number of languages are :"+numberoflanguages[i]);
	 }
	 
	 for(int i=0;i<nameoflanguages.length; i++){
	 System.out.println("name of languages are :"+nameoflanguages[i]);
	 
	 }
	 
	 for(int i=0;i<isreadable.length; i++){
	 System.out.println("is readable:"+isreadable[i]);
	 }
	 
	 for(int i=0;i<version.length; i++){
	 System.out.println("version is:"+version[i]);
	 
	 } 
	}
}