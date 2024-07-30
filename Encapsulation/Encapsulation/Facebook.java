public class Facebook{
 
 private String username;
 private int userId;;
 private int noofPost;
 private int noofFriends;
 private int noofLikes;
 
 public Facebook(){
   System.out.println("no argument constructor");
 }
 
 public Facebook(String username,int userId,int noofPost,int noofFriends,int noofLikes){
  this.username=username;
  this.userId=userId;
  this.noofPost=noofPost;
  this.noofFriends=noofFriends;
  this.noofLikes=noofLikes;
 }
 
 public void setusername(String username){
   this.username=username;
 }
 
 public String getusername(){
   return this.username;
 }
 
 public void setuserId(int userId){
   this.userId=userId;
  }
  
  public int getuserId(){
   return this.userId;
  }
  public void setnoofPost(int noofPost){
   this.noofPost=noofPost;
   }
   public int getnoofPost(){
    return this.noofPost;
  }
  public void setnoofFriends(int noofFriends){
   this.noofFriends=noofFriends;
   }
   
   public int getnoofFriend(){
     return this.noofFriends;
   }
   public void setnoofLikes(int noofLikes){
   this.noofLikes=noofLikes;
   }
   public int getnoofLikes(){
    return this.noofLikes;
   }
   
   
  

   
}
  
  
 
 

