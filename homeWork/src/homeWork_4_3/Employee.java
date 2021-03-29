package homeWork_4_3;

public class Employee {
	private int empno ; //員工編號
	private String name ; //員工姓名
	private long salary ; //薪水
	private long bonus ; //分紅
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public long getBonus() {
		
		return bonus;
	}
	
	public int getEmpno() {
		return empno;
	}
//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public long getSalary(long salary, long bonus) {
		return salary;
	}
	
	public long getSalary() {
		return salary;
	}
//	public void setSalary(long salary) {
//		this.salary = salary;
//	}
	
	public Employee(int empno,String name,long salary,long bonus) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		
	}
	
	
	
	
	
	
}

	
