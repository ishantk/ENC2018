package com.auribises.model;

public class Certificate {

	// Attributes
	Integer cid;
	String cname;
	
	public Certificate() {
		
	}
	
	public Certificate(Integer cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", cname=" + cname + "]";
	}
}
