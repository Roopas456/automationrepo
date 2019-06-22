package NewPackagearrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> list1=new ArrayList<String>();
		list1.add("Wipro");
		list1.add("Infosys");
		list1.add("Test Mahindra");
		list1.add("Wipro");
		//for(String S1:list1)
		Iterator<String> itr1=list1.iterator();
		while(itr1.hasNext())  //if has next is false it will not enter while loop
		{
			System.out.println(itr1.next()); // next will print first and move cursor to next element

	}

	}
}
