package homeWork_4_3;



public class Manager extends Employee{
	
	public Manager(int empno,String name ,long salary,long bonus) {
		super(empno, name, salary, bonus);
			
	}
	
	@Override
	public long getSalary(long salary, long bonus)  {
		long totalSalary = salary + bonus;
		
		return totalSalary;
	}
       
	
	
	public static void main(String[] args) {
		

		
		Employee p = new Manager(100, "David", 50000, 500);
//		p.getSalary(50000, 500);
		
		System.out.println("覆寫前");		
		System.out.println("主管編號:" + p.getEmpno()+","+"主管姓名:"+p.getName()+","+"主管薪水:"+p.getSalary()+","+"主管分紅:"+p.getBonus());
        
		System.out.println("覆寫後");		
		System.out.println("主管編號:" + p.getEmpno()+","+"主管姓名:"+p.getName()+","+"主管薪水+分紅:"+p.getSalary(50000, 500));
	}
	
	
	
}
