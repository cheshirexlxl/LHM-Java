package Ex03;

import java.util.LinkedList;

public class Manager {	
	
	public static void main(String[] args) {		
		LinkedList<Student> list = new LinkedList<>();
		Student.getTxtToList(list);
		
		for (Student st : list) {
			System.out.println(st.no + "\t" + st.name + "\t" + st.score + "\t" + st.className);
		}			
	}
}
