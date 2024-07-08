public class Serials{

		public static void getname(){
			String name = "lakshmi nivas";
		
		System.out.println("Eneter the serial name:"+name);
		if(name=="lakshmi nivas"){
		System.out.println("Entered serial name:"+name);
		}else{
		System.out.println("Forget");
		}
	}
		public static void channel(String name){
	      String channel="colors kannada";
		if(channel=="colors kannada"){
		System.out.println("channel name is:"+name);
		}else{
		System.out.println("channel name is:"+name);
		}
	}
		public static boolean download(String songs,boolean song){
		if(song = true){
		System.out.println("Song successfully downloaded::"+songs);
		}else{
		System.out.println("NO downloads");
		}return true;
	}
		public static int value(String languages[],int num){

		for(int index=0;index<languages.length;index++){
		if(languages.length!=num){
		System.out.println("Select languages are:"+languages[index]);
		}else{
		System.out.println("You have not select any language");
		}
		}	return 35;
	}
}