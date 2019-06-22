package NewPackagearrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Integer,String> map1=new HashMap<Integer,String>();
		map1.put(100,"Wipro");
		map1.put(101,"Infosys");
		map1.put(99,"Test Mahindra");
		map1.put(200,"Wipro");
		map1.put(null,"Wipro");  // hashmap can have one null key,but not more than 
		
		map1.put(20,null);  // hashmap can have value more than 1
		
		for(Map.Entry map2:map1.entrySet())
		{
			System.out.println(map2.getKey()+ "" +map2.getValue());
		}

	}

}
