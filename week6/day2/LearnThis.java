package week6.day2;

public class LearnThis {

	String empName;
	String empId;
	
	
	public static  void empDetails(String empName,String empId) {
		//this.empName=empName;		
		System.out.println(empName+ " " +empId);
	//	return new LearnThis();
	}	
	
	public static void printDetails() {
		empDetails("Peter","12");
		//return new LearnThis();
	}
	
	
	public int callMethods() {
		int x=10;
		return x;
	}
		
	
	public static void main(String[] args) {
		
		LearnThis lt=new LearnThis();
		/*
		 * lt.empDetails("Vidya", "emp19"); System.out.println(lt.empName);
		 * System.out.println(lt.empId); lt.printDetails();
		 * System.out.println(lt.empName);
		 * 
		 * 
		 * lt.empDetails(null, null);
		 */	
		
		empDetails("vidya","emp12");
		printDetails();
		
	}

}
