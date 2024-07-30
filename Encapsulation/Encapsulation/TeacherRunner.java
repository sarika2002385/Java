public class TeacherRunner{
  public static void main(String args[]){
  
	  
	  Teacher teacher=new Teacher();
	  teacher.setName("vinoda");
	  System.out.println("name:"+teacher.getName());
	  
	  teacher.setsalary(50000);
	  System.out.println("salary:"+teacher.getsalary());
	  
	  teacher.setsubjecttaken("java");
	  System.out.println("is ticket:"+teacher.getsubjecttaken());
	  
	  teacher.setexperience((byte)20);
	  System.out.println("experience:"+teacher.getexperience());
	  
	  
	  
	  
	 }
}
  
  