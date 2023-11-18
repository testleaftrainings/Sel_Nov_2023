package week1.day1;

public class LearnDatatypes {

	public static void main(String[] args) {
		//to declare the data
		//literal
		//datatype variableName=value
		//namingConvention-->camelCase		
		
		        char initial='S';
		        String name= "Tilak"; //collection of characters
		        String ini="S";
		        String dob="12/03/1987";
			    int	age=35;	
				long phno=87363892009l;
				long accountNumber =1628303802987l;
		     	boolean	haveProperty=true;
				double salary=237848.45567;
				float height=5.4f;
				
				System.out.println("The initial is :");
				System.out.println(initial);//to print the value from a variable
				
				System.out.println("The initial is :"+initial);
				//+ -->concatenation- appending the variable to the user text
				System.out.println(name +"."+ini);
				System.out.println(dob);
				System.out.println("Do you have property ? "+haveProperty);
				
	}

}
