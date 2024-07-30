public class StudentRunner{
	public static void main(String[] args){
		int[] grade={1,2,3,4,5};
		Student student=new Student("XYZ",grade);
		student.avg();
		student.getinfo();
		student.setinfo();
	}
}