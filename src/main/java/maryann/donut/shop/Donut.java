package maryann.donut.shop;

public class Donut {

	private Integer id;
	private String ref;
	private String name;

	public Donut() {

	}

	public Donut(Integer id, String ref, String name) {
		this.id = id;
		this.ref = ref;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
