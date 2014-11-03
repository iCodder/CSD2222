public class Student {
	
	private String strName;//name has default value null
	private int age;//age has default value 0
	private char gender;//character has default value '\u0000'
	private String programme, programme1;
	

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	//construct a student with a name John
	public Student(String namePar, int agePar, char genderPar, String programmePar, String programme1Par){
		this.strName = namePar;
		this.age = agePar;
		this.gender = genderPar;
		this.programme = programmePar;
		this.programme1 = programme1Par;
		
	}
	
	public void checkIt(){
		if(programme==programme1){
			System.out.println(" Programme: " + programme1);
		}else{
			System.out.println(" Sorry  ");
			}
		}
	
	
	public void displayStudentDetails(){
		System.out.println(" Name: " + strName + '\n' + " Age: " + age + '\n' + " Gender: " + gender
				+ '\n' + " Programme: " + programme);
	
	}
	
}


