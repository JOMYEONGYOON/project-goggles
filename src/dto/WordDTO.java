package dto;

public class WordDTO {
	private int id;
	private String name;
	private String def;
	private String category;

	public WordDTO() {

	}

	public WordDTO(String name, String def, String category) {

		this.name = name;
		this.def = def;
		this.category = category;

	}

	public WordDTO(int id, String name, String def, String category) {

		this.id = id;
		this.name = name;
		this.def = def;
		this.category = category;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getCatagory() {
		return category;
	}

	public void setCatagory(String catagory) {
		this.category = catagory;
	}

}
