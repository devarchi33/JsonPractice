package gsonpactice.gsonpactice;

public class School {

	private String name;
	private String location;
	private int enterYear;
	
	public School(String name, String location, int enterYear) {
		super();
		this.name = name;
		this.location = location;
		this.enterYear = enterYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEnterYear() {
		return enterYear;
	}

	public void setEnterYear(int enterYear) {
		this.enterYear = enterYear;
	}
	
}
