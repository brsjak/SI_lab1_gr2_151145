public class Faculty{
	List<Student> students;
	String facultyName;
	
	
	public Faculty() {}
	
	public addStudent(Student s) {
		students.add(s);
	}
	
	public double getStudentAverage(Student s) {
		Integer [] tmp = s.grades;
		int sum;
		for(int i=0;i<tmp.length;i++) {
			sum+=tmp[i];
		}
		
		return sum/tmp.length;
	}
	
	public int getNumberPassedExams(Student s) {
		Integer [] tmp = s.grades;
		int count = 0;
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i]>=6) {
				count++;
			}
		}
		return count;
	}
}