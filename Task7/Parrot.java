public class Parrot{

		public static void color(){
			String color = "green";
		
		System.out.println("Eneter the color:"+color);
		if(color=="green"){
		System.out.println("Entered color:"+color);
		}else{
		System.out.println("color is not");
		}
	}
		public static void size(float size){
	      size=2.5f;
		if(size>2){
		System.out.println("size is correct:"+size);
		}else{
		System.out.println("size is:"+size);
		}
	}
		public static boolean iscute(boolean iscute){
		   iscute=true;
		if(iscute==true){
		System.out.println("is cute :"+iscute);
		}else{
		System.out.println("is cute:"+iscute);
		}return true;
	}
		public static String country(String country_name){
		    country_name="india";

		
		if(country_name=="india"){
		System.out.println("livincountry is:"+country_name);
		}else{
		System.out.println("country:"+country_name);
		}
		return "india";
		}	
	}
