package week3.LearnAbstraction;

import java.util.ArrayList;
import java.util.List;

public class LearnCollectionList {

	public static void main(String[] args) {
		List<String> mentors =new ArrayList<String>();
		
		mentors.add("Raghu");
		mentors.add("Aravind");
		mentors.add("Subraja");
		mentors.add("Princilla");
		System.out.println(mentors);
		
		//to get from the list
		String name = mentors.get(2);
		System.out.println(name);
		
		mentors.add(2, "Jagadeesh");
		System.out.println(mentors);
		
		mentors.remove(3);
		System.out.println(mentors);
		
		mentors.clear();
		System.out.println(mentors);
		boolean contains = mentors.contains("Aravind");
		System.out.println(contains);
		
		
		
	}

}
