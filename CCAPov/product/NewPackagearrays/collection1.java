package NewPackagearrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collection1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
List <String> list1=new ArrayList<String>();
list1.add("Wipro");
list1.add("Infosys");
list1.add("Test Mahindra");
list1.add("Wipro");
for(String S1:list1)
	System.out.println(S1);

List <String> list2=new LinkedList<String>();
list2.add("Wipro");
list2.add("Infosys");
list2.add("Test Mahindra");
list2.add("Wipro");
for(String S2:list2)
	System.out.println(S2);


System.out.println("this is arraylist" +list1);
System.out.println("this is linkedlist" +list2);

//this is arraylist[Wipro, Infosys, Test Mahindra]--result
//this is linkedlist[Wipro, Infosys, Test Mahindra]---result
//we can traverse through each element of collection in 3 ways

	}

}
