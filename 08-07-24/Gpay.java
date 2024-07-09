public class Gpay{
 public static void usedBy(){
 String uses="amount transfer";
System.out.println("uses are:"+uses);
}

public static void Sector(String sector ){
 sector="Banks";
System.out.println("sector are:" +sector);
}


public static boolean issecure(){
  boolean issecure=true;
 if(issecure==true){
System.out.println("is secure for transfer :" +issecure);
}else{
System.out.println("is secure for transfer:"+issecure);
}
return true;
    
}


public static int maxamount (int maxamount){
  maxamount=100000;
  if(maxamount>50000){
  System.out.println("maxamount is:" +maxamount);
}else{
  System.out.println("maxamount is:"+maxamount);
}
return 100000;

    
}
}






