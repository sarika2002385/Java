public class FacebookRunner{
  public static void main(String args[]){
  
  
  Facebook face=new Facebook();
  
   face.setusername("sarika");
   if(face.getusername()=="sarika" && face.getusername()=="sarika"){
   System.out.println("name:"+face.getusername());
   System.out.println("name is matching");
   }else{
   System.out.println("not match");
   }
    //System.out.println("name:"+face.getusername());
	
   face.setuserId(123543);
   System.out.println("id:"+face.getuserId());
   
   face.setnoofPost(10);
   if(face.getnoofPost()>25 && face.getnoofPost()<50){
   System.out.println("noofPost:"+face.getnoofPost());
   System.out.println("no of post are matching");
   }else{
   System.out.println("not match");
   }
   
   face.setnoofFriends(120);
   System.out.println("friends:"+face.getnoofFriend());
   
   face.setnoofLikes(100);
   System.out.println("Likes:"+face.getnoofLikes());
  }

}
