package com.sai.Employee;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.sai.company.Company;



@Component(value = "emp")
@ConfigurationProperties(prefix = "com.emp")
public class Employee {
	private int id;
	private String name;
	private int age;
	private String company;
	
	@Autowired(required=true)
	private LocalDateTime doj;
	
	private String[] projects;
	private List<String> colleagueNames;
	private Set<Long> phoneNumbers;
	private Map<String,Long> idDetails;
	
	private Company company2;
	
	static {
		System.out.println("Employee.class file loaded");
	}
	public Employee() {
		System.out.println("Employee constructor is created");
	}
	
	
	public Company getCompany2() {
		return company2;
	}


	public void setCompany2(Company company2) {
		this.company2 = company2;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Employee.setAge()");
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("Employee.setCompany()");
		this.company = company;
	}

	public LocalDateTime getDoj() {
		return doj;
	}

	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}

	
	public String[] getProjects() {
		return projects;
	}

	public void setProjects(String[] projects) {
		this.projects = projects;
	}

	public List<String> getColleagueNames() {
		return colleagueNames;
	}

	public void setColleagueNames(List<String> colleagueNames) {
		this.colleagueNames = colleagueNames;
	}

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Long> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Long> idDetails) {
		this.idDetails = idDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + ", doj=" + doj
				+ ", projects=" + Arrays.toString(projects) + ", colleagueNames=" + colleagueNames + ", phoneNumbers="
				+ phoneNumbers + ", idDetails=" + idDetails + ", company2=" + company2 + "]";
	}
	
	
	
}
