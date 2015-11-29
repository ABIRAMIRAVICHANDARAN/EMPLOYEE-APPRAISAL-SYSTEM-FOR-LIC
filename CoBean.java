package copack;

public class COBean {
	
	
	private String Name;
	private String Mobileno;
	private String Email;
	private int Age;
	private String Qualification;
	private String City;
	private String State;
	private String Username;
	private String Password;
	private String JoiningDate;
	
	
	
	public COBean(){
		
	}
	
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobileno() {
		return Mobileno;
	}

	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public String getQualification() {
		return Qualification;
	}
	
	public void set(String qualification) {
		Qualification = qualification;
	}

	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}


	
	
	
	@Override
	public String toString() {
		return "COBean [Name=" + Name + ", Mobileno=" + Mobileno + ", Email="
				+ Email + ", Age=" + Age + ", City=" + City + ", State="
				+ State + ", Username=" + Username + ", Password=" + Password
				+ ", JoiningDate=" + JoiningDate + "]";
	}

	

}
