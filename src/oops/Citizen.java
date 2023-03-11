package oops;

public class Citizen extends PersonClass{
	
	public int SSN;
	
public Citizen() {
		
		super ();
	System.out.println("inside default cons of Citizen");
	}
	
	public Citizen(String Name, String CountryName, int age, int SSN) {
		
	super ();
    System.out.println("Inside param cons of Citizen");
		
		this.Name = Name;
	    this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;	
	}
	
public void Print() {
	
		System.out.println("SSN is " + SSN);

}
}

