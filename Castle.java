package Tower;

public class Castle {
	public String name;
	public String Description;
	
	public Castle(String name, String description) {
		super();
		this.name = name;
		Description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Castle() {
		
	}

}
