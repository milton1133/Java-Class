package homeWork_4_2;



public class Manager extends Employee{
	
	public Manager(int empno,String name ,long salary,long bonus) {
		super(empno, name, salary, bonus);
			
	}
	
      	
	
	public static void main(String[] args) {
		
		Manager man = new Manager(100, "David", 50000, 500);
		System.out.println("主管編號:" + man.getEmpno()+","+"主管姓名:"+man.getName()+","+"主管薪水:"+man.getSalary()+","+"主管分紅:"+man.getBonus());
	}
	
	
	
}
