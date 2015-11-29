package agentpack;

public class AgentBean {
	
	
	 
	
	
private String AgentID;	

private String agname;
private String mob;
private String email;
private int age;
private String state;
private String city;
private String user;
private String Pass;
private String Intro;


public AgentBean(){}

public String getAgentID() {
	return AgentID;
}

public void setAgentID(String agentID) {
	AgentID = agentID;
}
public String getAgname() {
	return agname;
}
public void setAgname(String agname) {
	this.agname = agname;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPass() {
	return Pass;
}
public void setPass(String pass) {
	Pass = pass;
}
public String getIntro() {
	return Intro;
}
public void setIntro(String intro) {
	Intro = intro;
}
@Override
public String toString() {
	return "AgentGetSet [AgentID=" + AgentID + ",agname=" + agname + ", mob=" + mob + ", email="
			+ email + ", age=" + age + ", state=" + state + ", city=" + city
			+ ", user=" + user + ", Pass=" + Pass + ", Intro=" + Intro + "]";
}


	
	
	
	
	

}
