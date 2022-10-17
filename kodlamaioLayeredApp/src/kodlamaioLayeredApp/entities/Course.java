package kodlamaioLayeredApp.entities;

public class Course {
	private int id;
	private double price;
	private String name;
	private String description;
		
	public Course(int id, double price, String name, String description) {
		
		super();
		this.description = description;
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

		
	}

