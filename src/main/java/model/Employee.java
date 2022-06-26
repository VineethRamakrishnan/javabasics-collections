package main.java.model;

import java.util.Objects;

public class Employee implements Comparable{

	private Integer id;
	
	private String name;
	
	private String address;
	
	private Double salary;

	public Employee(Integer id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//During the execution of the application it should be same till the attributes used in equals comparison doesn't change
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Object o) {
		
		if(o == null) {
			throw new NullPointerException("Inside compareTo :: Given object is null");
		}
		else if (o instanceof Employee) {
			Employee temp = (Employee) o;
			if(temp.getId() > this.getId())		return -1;
			else if (temp.getId() == this.getId())		return 0;
			else return 1;
		}
		else {
			System.out.println("WARNING: comparing object should be instance of same class");
		}
		return 0;
	}

	
	
}
