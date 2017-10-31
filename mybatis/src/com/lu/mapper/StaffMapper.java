package com.lu.mapper;

import java.util.List;

import com.lu.pojo.QueryVo;
import com.lu.pojo.Staff;

public interface StaffMapper{
public Staff findStaffById(String id);
public List<Staff> findStaffQueryVo(QueryVo vo);
public int  findCountQueryVo(QueryVo vo); 
public  List<Staff> findStaffByNameAndId(Staff staff); 
public  List<Staff> findStaffByIdList(QueryVo queryVo); 	

}
