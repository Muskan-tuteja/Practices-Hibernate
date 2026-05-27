package Hibernate.Customer;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Customer1 {
	@Id
	private int id;
	private String name;
	private String email;
	private int marks;
	
	public  Customer1 (){
		
	}
	public  Customer1  (int id,String name, int marks,String email) {
		this.id=id;
		this.email=email;
		this.marks=marks;
		this.name =name;
		
		
		
		
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
