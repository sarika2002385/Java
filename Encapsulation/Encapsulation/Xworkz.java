public class Xworkz{

 private String hrname;
 private int salary;
 private String location;
 private String course;
 
 public Xworkz(){
  System.out.println("no argument constructor");
 }
 
 /*public Xworkz(String hrname,int salary,String location,String course){
  this.hrname="Amulya";
  this.salary=45000;
  this.location="Btm";
  this.course="java";
 }*/
 
 public void setName(String hrname){
   this.hrname=hrname;
}
 public String getName(){
	 return this.hrname;
 }
 
 public void setsalary(int salary){
   this.hrname=hrname;
}
 public int getsalary(){
	 return this.salary;

}

public void setlocation(String location){
  this.location=location;
}
 public String getlocation(){
	 return this.location;
 }
 public void setcourse(String course){
   this.course=course;
}
 
 public String getcourse(){
	 return this.course;
 }
}