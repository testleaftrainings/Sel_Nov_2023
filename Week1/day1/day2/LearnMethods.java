package week1.day2;

public class LearnMethods {

	int z = 25; // global/instance variable
	// reusable method for addition funtionality

	public int add(int x, int y) {
		int c = x + y ; // local variable
		return c;// last line
	}

	public String funName(String calulation) {
		return calulation;	}

	public void sub(int a, int b) {
		int v = a - b;
		System.out.println(v);
	}	
	public void manipulate(String manipulation) {
		System.out.println(manipulation);
	}	
	public static void main(String[] args) {

		LearnMethods cal = new LearnMethods();// allocates the memory class the member

		int resOfSumm = cal.add(10,20);
		System.out.println(resOfSumm);
		// get the return type of the value -->ctrl 2 l		
		int result = cal.add(15,30);
		System.out.println("The Second i/o: " +result);
		
		cal.sub(result, 10);		
		cal.sub(resOfSumm, result); //55-70
		
		String funName = cal.funName("Addition");
		cal.manipulate(funName);
		

		
	}

	// add the product price-->discount
	// 20 +30 =50 -->50-10= 40

}
