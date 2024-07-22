public class Office{

// default constructor

   public  String emp_name;
 
   public  int id;
   public  float height;
   public  int emp_age;
   public  String company_name;
   public  int salary;
   
   public Office(){
		System.out.println("no arguments present");
	}
	
    public Office(String emp_name,int id){		
		 this.emp_name=emp_name;
		 this.id=id;
    }
	
	public Office(float height,int emp_age){		
		 this.height=height;
		 this.emp_age=emp_age;
    }
	
	public Office(int salary,String company_name){		
		 this.company_name=company_name;
		 this.salary=salary;
		 
		 System.out.println("emp name:"+emp_name);
	     System.out.println("id is:"+id);
		 System.out.println("height is:"+height);
		 System.out.println("age is:"+emp_age);
		 System.out.println("company is:"+company_name);
		 System.out.println("salary is:"+salary);
	}
}