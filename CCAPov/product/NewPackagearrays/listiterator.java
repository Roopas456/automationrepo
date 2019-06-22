package NewPackagearrays;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
			List <String> list1=new ArrayList<String>();
			list1.add("Wipro");
			list1.add("Infosys");
			list1.add("Test Mahindra");
			list1.add("Wipro");
			//for(String S1:list1)
			
			
			ListIterator<String> itr1=list1.listIterator();  // here chnage is listIterator
			while(itr1.hasNext())  //if has next is false it will not enter while loop
			{
				System.out.println(itr1.next()); // next will print first and move cursor to next element
				System.out.println("Traversing in forward");
				

		

		}
			
			
			while(itr1.hasPrevious())  //if has next is false it will not enter while loop
			{
				System.out.println(itr1.previous()); // next will print first and move cursor to next element
				System.out.println("Traversing in backward");

		

		}
			

	}

}
