package week4_topic_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		List<String> employeeNames = new ArrayList<String>();
		
		//2.
		Set<Integer> ids = new HashSet<Integer>();
		
		//3.
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//4.
		employeeNames.add("Dwight");
		employeeNames.add("Stanley");
		employeeNames.add("Pam");
		employeeNames.add("Jim");
		employeeNames.add("Darryl");
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		//5.
		int i = 0;
		
		for (int number : ids){
			employeeMap.put(number, employeeNames.get(i));
			i++;
		}
	
		//6.
		for (Integer key : employeeMap.keySet()){
		System.out.println(key + " " + employeeMap.get(key));
		}
		
		//7.
		StringBuilder idsBuilder = new StringBuilder();
		
		//8.
		for (int id : ids){
			idsBuilder.append(id + "-");
		}
		
		//9.
		System.out.println(idsBuilder.toString());
		
		//10.
		StringBuilder namesBuilder = new StringBuilder();
		
		//11.
		for (String name : employeeNames){
			namesBuilder.append(name + " ");
		}
		
		//12.
		System.out.println(namesBuilder.toString());
	
	}
}
