public class Cable{
 public static void product_name(){
 String name="polycab pvc";
System.out.println("product name is:"+name);
}

public static void product_name(int price){
 price=500;
System.out.println("price is:" +price);
}


public static String type(){
  String type= "insulated wires";
 if(type== "insulated wires"){
System.out.println("type is:" +type);
}else{
System.out.println("type is:"+type);
}
return "insulated wires";
    
}


public static float size(float size){
 size=3.5f;
 if(size==3.5f){
System.out.println("size is:" +size);
}else{
System.out.println("size is:"+size);
}
return 3.5f;
    
}
}



