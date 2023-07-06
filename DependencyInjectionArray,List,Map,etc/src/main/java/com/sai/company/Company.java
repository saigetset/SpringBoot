package com.sai.company;

import org.springframework.stereotype.Component;

@Component(value="company")
public class Company {
	static {
		System.out.println("Company.class is loaded");
	}
	public Company() {
		System.out.println("Company constructor");
	}
	private int companyId;
	private String companyName;
	private String companyLoc;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLoc() {
		return companyLoc;
	}
	public void setCompanyLoc(String companyLoc) {
		this.companyLoc = companyLoc;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyLoc=" + companyLoc + "]";
	}
	
}
