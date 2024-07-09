public class Payroll {

    public static void info(String empname, double salary){
  System.out.println("the emp name is:" + empname + " " + "salary is:" + salary);
  }  
  
  
  public static void info(int hoursworked, double hourlyrate){
  System.out.println("the hours worked is:" + hoursworked+ ", " + "The hourly rate is:"+ hourlyrate);
  }
  
  public static String info(float ctc, int age){
    if(ctc==4.0 && age==25){
       System.out.println("the ctc is:" + " ," + "the age is:" + age);
     return "It is good";
	}else{
      System.out.println("Not satisfied");
     return "It is bad";
	}
  }
  
  public static void info(String empname, short bonus){
  if(empname=="sarika" || bonus==6000){
  System.out.println("The emp name:" + empname+ "," + "bonus is:"+ bonus);
  }else{
  System.out.println("not mentioned");
}
}  
  
  }
