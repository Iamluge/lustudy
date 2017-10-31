package com.lu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Orders  implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer staffId;

    private String number;

    private Date createtime;

    private String note;
    
    //附加对象  用户对象
    private Staff staff;

	public Integer getId() {
        return id;
    }

    public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public void setId(Integer id) {
        this.id = id;
    }



    public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "Orders [id=" + id + ", staffId=" + staffId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", staff=" + staff + "]";
	}

    
    
}