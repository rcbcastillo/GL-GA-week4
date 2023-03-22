package comqagl.copy;

public class Pet {
	private int id;
	private String name;
	private String owner;
	private String sex;
	private String birthdate;
	private String species;

	public Pet(int id, String name, String owner, String sex, String birthdate, String species) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.sex = sex;
		this.birthdate = birthdate;
		this.species = species;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", owner=" + owner + ", sex=" + sex + ", birthdate=" + birthdate
				+ ", species=" + species + "]";
	}
}
