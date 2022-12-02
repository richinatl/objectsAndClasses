package objectsAndClasses;

public class Pet {

	
	private String name; 
	private int age; 
	private String location;
	private String type;
	
	public Pet() {
		// Empty constructor
	}
	
	// Constructor with all properties
	
	public Pet (String name, int age, String location, String type) {
		this.name = name; 
		this.age = age; 
		this.location = location;
		this.type = type;
	}
	
	// Constructor with name only
	public Pet(String name) {
		this.name = name; 
	}
	
	//Methods
	
	 public void sayHello(){
		   	System.out.println("Hello " +  name);

		   }
	 
	 public void myType(){
		   	System.out.println("I am a  " +  type);

		   }
	 
	 // Getters
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 public String getLocation() {
		 return location;
	 }
	 
	 public String getType() {
		 return type;
	 }
	 
	 // Setters
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 public void setLocation(String location) {
		 this.location = location;
	 }
	 
	 public void setType(String type) {
		 this.type = type;
	 }
	 
	 


	public static void main(String[] args) {
		
		// Test the code
		Pet fish = new Pet(); // empty constructor
		
		Pet cat = new Pet("trouble"); // one property constructor
		
		Pet dog = new Pet("Max", 2, "home", "golden retriever");
		
		cat.sayHello();
		dog.myType();
	

	}
}
