package com.lu.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable{
	private Staff staff;
	private List<String> idList;

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	

}
