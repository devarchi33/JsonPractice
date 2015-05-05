package gsonpactice.gsonpactice;

import java.util.List;

public class Member {

	private String name;
	private int age;
	private List<School> schools;
	
	public Member(String name, int age, List<School> schools) {
		super();
		this.name = name;
		this.age = age;
		this.schools = schools;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}
	
}
