package com.nit.bean;
public class GetDate {
	
	private int sno;
	private String sname;
	private long mobile;
	private char gender;
	
	
	public GetDate(int sno, String sname, long mobile, char gender) {
		System.out.println("GetDate :: 4-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.mobile = mobile;
		this.gender = gender;
	}


	public GetDate(int sno, String sname, long mobile) {
		System.out.println("GetDate :: 3-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.mobile = mobile;
	}


	public GetDate(int sno, String sname) {
		System.out.println("GetDate :: 2-param constructor");
		this.sno = sno;
		this.sname = sname;
	}


	@Override
	public String toString() {
		return "GetDate [sno=" + sno + ", sname=" + sname + ", mobile=" + mobile + ", gender=" + gender + "]";
	}
	
		
}
