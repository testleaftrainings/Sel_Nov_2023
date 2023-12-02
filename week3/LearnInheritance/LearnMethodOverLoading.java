package week3.LearnInheritance;

public class LearnMethodOverLoading {

	
	
	public void add() {
		System.out.println("Addition");
	}
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add(int x,String name) {
		System.out.println(x+name);
	}
	
	public void add(int x, int y,float z) {
		System.out.println(x+y+z);
		
	}
	
	
	public static void main(String[] args) {
		LearnMethodOverLoading mo=new LearnMethodOverLoading();
		mo.add(10, 10, 2.5f);
		

	}

}
