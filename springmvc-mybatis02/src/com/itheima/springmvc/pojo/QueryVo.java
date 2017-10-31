package com.itheima.springmvc.pojo;

import java.util.List;

public class QueryVo {

	
	//商品
	private Items items;
	//定义一个itemlist用于接收要修改的东东
	private List<Items> itemList;

	public List<Items> getItemList() {
		return itemList;
	}

	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}
	
}
