package objectsAndClasses;

public class MyClass {
	// variables
	private String name; 
	private int games; 
	private String team; 
	
	// empty constructor
	public MyClass() {
		
	}
	
	// constructor with two properties
	public MyClass(String name, int games) {
		this.name = name; 
		this.games = games;
	}
	
	// constructor with all three
	public MyClass(String name, int games, String team) {
		this.name = name; 
		this.games = games; 
		this.team = team;
	}
    
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return games;
	}

	public void setAge(int age) {
		this.games = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	// methods
	public boolean isNumberOne() {
		return true; 
	}
	
	
	public void favTeam() {
		System.out.println("Kirby's got these boys rollin");
	}
	
	public void letsGo() {
		System.out.println("We're gonna be champions");
	}
	
	public String mostValublePlayers(String list) {
		return list;
		
	}
	
	public static void main(String[] args) {
		MyClass georgia = new MyClass("Georgia", 12, "Dawgs");
		System.out.println("Stacked with talent, but these guys bring it every week");
		System.out.println(georgia.mostValublePlayers("Jalen Carter, Brock Bowers, Stetson Bennnet"));
		System.out.println("");
	    System.out.println("Are we the best? ");
	    System.out.println(georgia.isNumberOne());
        System.out.println("");
        georgia.favTeam();
        System.out.println("");
        georgia.letsGo();
        System.out.println("UGA...UGA...UGA"); // There's some irony here in that I went to tech
        System.out.println("");
	}
	


}
