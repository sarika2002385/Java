package com.search.searchengineapplication;

public class SearchEngine {
	String name;
	String founder;
	int users;
	int foundedYear;
	
public SearchEngine(String name,String founder,int users,int foundedYear) {
	this.name=name;
	this.founder=founder;
	this.users=users;
	this.foundedYear=foundedYear;
}
	

	public String display(){
		return "name:"+name + " " +"founder:"+founder + " "+ "users:"+users + " "+ "founded year:"+foundedYear;
	}
	
}


