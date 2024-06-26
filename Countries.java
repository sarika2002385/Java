public class Countries{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     String nameofCountries[]={"india","japan","USA","jermany","Australia"};
     float Countriesrate[]={44.92f,1.727f,1.083f,107.765f,0.661f};
	 int CountriesCode[]={91,44,52,1,86}; 
     
	 
	 //Display Countries of each arrays
	 for(int i=0;i<nameofCountries.length; i++){
	 System.out.println("Countries names are:"+nameofCountries[i]);
	 }
	 
	 for(int i=0;i<Countriesrate.length; i++){
	 System.out.println("Countries rate are:"+Countriesrate[i]);
	 
	 }
	 for(int i=0;i<CountriesCode.length; i++){
	 System.out.println("Countries code are:"+CountriesCode[i]);
	 
	 } 
	}
}
	