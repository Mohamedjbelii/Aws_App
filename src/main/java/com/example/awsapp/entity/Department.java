package com.example.awsapp.entity;

//Java Program to Illustrate Department File

//Importing package module to code fragment

//Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Class
public class Department {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Getter @Setter private Long departmentId;
@Getter @Setter private String departmentName;
@Getter @Setter private String departmentAddress;
@Getter @Setter private String departmentCode;
public String getDepartmentName() {
	// TODO Auto-generated method stub
	return departmentName;
}
public void setDepartmentName(String departmentName2) {
	departmentName=departmentName2;
	// TODO Auto-generated method stub
	
}
public String getDepartmentAddress() {
	// TODO Auto-generated method stub
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress2) {
	// TODO Auto-generated method stub
	departmentAddress=departmentAddress2;
}
public String getDepartmentCode() {
	// TODO Auto-generated method stub
	return departmentCode;
}
public void setDepartmentCode(String departmentCode2) {
	// TODO Auto-generated method stub
	departmentCode=departmentCode2;
}


}