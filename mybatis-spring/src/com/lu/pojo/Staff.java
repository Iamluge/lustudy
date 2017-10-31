package com.lu.pojo;

import java.io.Serializable;
import java.util.List;

public class Staff implements Serializable{
	private String id;
	private String name;
	private String  telephone;
	private String station;
	private List<Orders> ordersList;
	public List<Orders> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", telephone=" + telephone + ", station=" + station + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}

}
