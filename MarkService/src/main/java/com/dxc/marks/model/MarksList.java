package com.dxc.marks.model;

import java.util.List;

public class MarksList {
	List<Marks> list;

	public MarksList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarksList(List<Marks> list) {
		super();
		this.list = list;
	}

	public List<Marks> getList() {
		return list;
	}

	public void setList(List<Marks> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MarksList [list=" + list + "]";
	}
	
	
	

}
