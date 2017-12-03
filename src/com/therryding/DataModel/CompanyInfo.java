package com.therryding.DataModel;

public class CompanyInfo {
	private String splitChar = ",";
	private String name;
	private String tel;
	private String email;
	private String manager;
	private static String header;
	
	public CompanyInfo(String name){
		this.name = name;
		this.tel = "ÔÝÎÞ";
		this.email = "ÔÝÎÞ";
		this.manager = "ÔÝÎÞ";
	}
	
	public CompanyInfo(String name,String tel,String email,String manager){
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.manager = manager;
	}
	
	public String toString(){
		return  this.name + this.splitChar+
				    this.tel + this.splitChar + 
				    this.email + this.splitChar + 
				    this.manager + "\r\n";
	}
	
	public void setSplitChar(String splitChar){
		this.splitChar = splitChar;
	}
	
	public static String getHeader(){
		return "name,tel,email,manager\r\n";
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setTel(String tel){
		this.tel = tel;
	}
	
	public String getTel(){
		return this.tel;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEamil(){
		return this.email;
	}
	
	public void setManager(String manager){
		this.manager = manager;
	}
	
	public String getManager(){
		return this.manager;
	}
}
