public class LinkDind{
  public static void profileDetails(String name,int age){
  System.out.println("name is:"+name + " " + "age is:" +age);
    LinkDind.educationDetails("engineering");
  
  }
  
  public static void educationDetails(String education){
  System.out.println("education is:"+education);
  LinkDind.skills("java");
  
  }
  
  public static void personalDetails(String village,float height){
  System.out.println("personal Details is:"+village + "," + "height is:" +height);
  LinkDind.percentageOfDegree(8.18f);
  
  }
  
  public static void skills(String skill){
  System.out.println("skills are:"+skill);
  LinkDind.personalDetails("bidar",3.5f);
  }
  
  public static void percentageOfDegree(float percentage){
  System.out.println("percentage is:"+percentage);
  LinkDind.profileDetails("sarika",20);
  
  }
  }