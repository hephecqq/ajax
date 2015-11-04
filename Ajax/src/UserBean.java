

public class UserBean {

	UserBean(String s1,String s2){
		this.name=s1;
		this.age=s2;
	}
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String name;
	public String age;
	
}
