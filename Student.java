class Student {
	String index;
	String firstName;
	String lastName;
	Integer [] grades; 
	//TODO constructor
	public Student() {}
	public Student(String index, String firstName, String lastName, Integer [] grades) {
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		for(int i=0;i<grades.length;i++) {
			this.grades[i]=grades[i];
		}
	}
	
	//TODO seters & getters
	
	//Get Methods
	
	public getIndex() {
		return this.index;
	}
	
	public getFirstName() {
		return this.firstName;
	}
	
	public getLastName() {
		return this.lastName;
	}
	public getGrades() {
		for(int i=0;i<this.grades;i++) {
			return grades[i];
		}
	}
	
	//Set Methods
	
	public setIndex(String index) {
		this.index=index;
	}
	
	public setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public setLastName(String lastName) {
		this.lastName=lastName;
	}
	public setGrades(Integer [] grades) {
		for(int i=0;i<grades.length;i++) {
			this.grades[i]=grades[i];
		}
	}
	

	public double getAverage() {
		//TODO
		int sum =0;
		for(int i=0;i<grades.length;i++) {
			sum+=grades[i];
		}
		
		return sum/grades.length;
	}

	public int ECTSCredits() {
		//TODO
		int ets;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]>=6) {
				ets+=grades[i];
			}
		}
		
		return ets*6;
	}
}
