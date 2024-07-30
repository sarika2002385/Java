public class Student{
	String name;
	int grades[];
	int index=0;
	double a=0;
	double sum=0;
	
	public  Student(String name,int[] grades){
		System.out.println("name:"+name);
		this.name=name;
		this.grades=grades;
		}
		
		public double avg(){
			for(int index=0;index<grades.length;index++){
			sum=a+grades[index];
		    index++;
			System.out.println("percentage:"+sum);
			}return a;
		
		}
		
		public int getinfo(){	
		for(int index=0;index<grades.length;index++){
			if(grades[index]<10){
				System.out.println("highest marks:"+sum);
			}
		}return 0;
			
}
        public int setinfo(){	
		for(int index=0;index>grades.length;index++){
			if(grades[index]>10){
				System.out.println("lowest marks:"+sum);
			}
			}return 0;
}
}