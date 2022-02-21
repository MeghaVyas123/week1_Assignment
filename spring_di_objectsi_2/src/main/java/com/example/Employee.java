package com.example;
import com.xyz.Location;
import com.xyz.Salary;

public class Employee {
	private int id;
	private String name;
	private Address address;// Aggregation
	private Salary salary;
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Employee() {
		System.out.println("Employee def cons");
	}

	public Employee(int id, String name, Address address, Salary salary,Location location) {
		super();
		this.id = id; // this(), this
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.location = location;
		System.out.println("Employee(int id, String name, Address address, Salary salary , Location location)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setting id");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setting address");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting name");
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}

	void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("address:" + address);
		System.out.println("salary:" + salary);
		System.out.println("location:" + location);
	}

}
