public class FarmRunner{
  public static void main(String args[]){
	  
	    Farm farm=new Farm();
	  
	    String[] fname = {"raju", "shiv","prasad"};
		farm.setfname(fname);
		
		//System.out.println("name is: " +farm.getfname());
		
        int[] budget = {10000, 50000, 30000, 40000};
		farm.setbudget(budget);
		
		//System.out.println("budget: " +farm.getbudget() );
		
        int[] experience = {1, 2, 3};
		farm.setexperience(experience);
		
		//System.out.println("experience: " +farm.getexperience());
		
        float[] field = {2.2f,3.5f,4.0f};
		farm.setfield(field);
		
		//System.out.println("field: " + farm.getfield());
  
        
	  
	  
      
  
  }

}