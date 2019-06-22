package NewPackagearrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setinterface1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Set <String> Setiterator1=new HashSet();
		Setiterator1.add("Wipro");
		Setiterator1.add("Infosys");
		Setiterator1.add("Test Mahindra");
		Setiterator1.add("Wipro");
		Setiterator1.add("Benz");
		//for(String S1:list1)
		
		
		Iterator<String> itr1=Setiterator1.iterator();
		while(itr1.hasNext())  //if has next is false it will not enter while loop
		{
			System.out.println(itr1.next()); // next will print first and move cursor to next element

	}

	}

}
