package homeWork_4_1;



public class TestEmployee {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpno(100);
		emp.setName("David");
		emp.setSalary(50000);
		
		
		System.out.println("員工編號:" + emp.getEmpno()+","+"員工姓名:"+emp.getName()+","+"員工薪水:"+emp.getSalary());
		
	}
}
