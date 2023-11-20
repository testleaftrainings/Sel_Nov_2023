package week1.day2;

public class AccessingArrayEle {

	public static void main(String[] args) {

		String[] week = { "Week1", "Week2", "Week3" };
		String[] days = { "day1", "day2", "day3" };

		// output --> week1
		// day1
		// day2
		// day3
		//nested loop
		for (int i = 0; i < week.length; i++) {// outer loop
			System.out.println(week[i]);
			for (int j = 0; j < days.length; j++) { // inner loop
				System.out.println(days[j]);
			}

		}
		
		//nested loop 
		//i=0 
		    // j=0,j=1,j=2
		//i=1 
		    //j=0,j=1,j=2
		//i=2
		    //j=0,j=1,j=2
	}

}
