package application;
//ChoiceDialogExample2
public class Book {
	private long id;
	private String code;
	private String name;
	
	public Book(long id, String code, String name) {
		this.id=id;
		this.code=code;
		this.name=name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
