public class Farm{
  
  private String[] fname;
  private int[]budget;
  private int[] experience;
  private float[] field; 
 

    public void setfname(String[] fname){
        this.fname = fname;
		for(int i=0;i<fname.length;i++){
		 System.out.println("name :"+fname[i]);
    }
	}
	
	public String[] getfname() {
        return fname;
	}

    public void setbudget(int[] budget) {
        this.budget = budget;
		for(int i=0;i<budget.length;i++){
		 System.out.println("budget :"+budget[i]);
    }
	}
	public int[] getbudget() {
        return budget;
    }

    public void setexperience(int[] experience){
        this.experience = experience;
		for(int i=0;i<experience.length;i++){
		 System.out.println("experience is :"+experience[i]);
		}
    }
	public int[] getexperience(){
        return experience;
	}

    public void setfield(float[] field){
        this.field = field;
		for(int i=0;i<field.length;i++){
		 System.out.println("field :"+field[i]);
    }
	}
	public float[] getfield() {
        return field;

}
      
}