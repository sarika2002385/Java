public class Doctor{

		public static void getname(){
			String name = "ravi";
		
		System.out.println("Eneter the name:"+name);
		if(name=="ravi"){
		System.out.println("Entered name:"+name);
		}else{
		System.out.println("name is not there");
		}
	}
		public static void name_of_degree(String name){
	      name="MBBS";
		if(name=="MBBS"){
		
		System.out.println("enter the degree name:"+name);
		}else{
		System.out.println("enter the degree name:"+name);
		}
	}
		public static String specialist_in(String specialist_in){
		   specialist_in="orthopedix";
		if(specialist_in=="orthopedix"){
		System.out.println("is specialist_in :"+specialist_in);
		}else{
		System.out.println("is specialist_in:"+specialist_in);
		}return "orthopedix";
	}
		public static int percentage(int percentage){
		    percentage=72;

		
		if(percentage>70){
		System.out.println("percentage is:"+percentage);
		}else{
		System.out.println("percentage:"+percentage);
		}
		return 70;
		}	
	}
