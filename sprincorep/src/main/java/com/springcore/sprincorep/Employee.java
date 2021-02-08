package com.springcore.sprincorep;

public class Employee {

  private String EmpName;
  private int EmpNo;
public String getEmpName() {
	return EmpName;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public int getEmpNo() {
	return EmpNo;
}
@Override
public String toString() {
	return "Employee [EmpName=" + EmpName + ", EmpNo=" + EmpNo + "]";
}
public void setEmpNo(int empNo) {
	EmpNo = empNo;
}
public Employee(String empName, int empNo) {
	super();
	EmpName = empName;
	EmpNo = empNo;
}

}
