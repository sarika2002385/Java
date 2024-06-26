public class Person{
    public static void main(String args[]){
  
    //Declare and initialize arrays of different types
     int age[]={35};
     String name[]={"Robert"};
	 boolean isalive[]={true};
     char initial[]={'R'};
	 
     
	 
	 //Display the each arrays
	 for(int i=0;i<age.length; i++){
	 System.out.println("age is :"+age[i]);
	 }
	 
	 for(int i=0;i<name.length; i++){
	 System.out.println("nameis :"+name[i]);
	 
	 }
	 
	 for(int i=0;i<isalive.length; i++){
	 System.out.println("isalive is:"+isalive[i]);
	 }
	 
	 for(int i=0;i<initial.length; i++){
	 System.out.println("initial is:"+initial[i]);
	 
	 } 
	}
}