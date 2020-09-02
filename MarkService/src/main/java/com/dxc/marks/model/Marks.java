package com.dxc.marks.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks {
	
	@Id
	private int id;
	private int examid;
	private int sub1;
	private int sub2;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int id, int examid, int sub1, int sub2) {
		super();
		this.id = id;
		this.examid = examid;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	@Override
	public String toString() {
		return "Marks [id=" + id + ", examid=" + examid + ", sub1=" + sub1 + ", sub2=" + sub2 + "]";
	}


}
