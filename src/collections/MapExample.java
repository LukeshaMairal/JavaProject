package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer>basket=new HashMap <String,Integer>();
		basket.put("Item1",1);
		basket.put("Item2",5);
		basket.put("Item3",2);
		basket.put("Item4",2);
		 System.out.println("The Map Is"+basket);
		 basket.put("Item3",4);
		 System.out.println("The Map Is After Change"+basket);
		 basket.remove("Item2");
		 System.out.println("Map After Deleting"+basket);
//		 basket.put("Item4",null);
//		 System.out.println("Map After Adding null"+basket);
//		 basket.put("null",null);
//		 System.out.println("Map After Adding null key is"+basket);
		 for(String Item:basket.keySet()) {
			 System.out.println("Item name is"+Item);
			 System.out.println("Item quantity is"+basket.get(Item));
			 for(Integer value:basket.values()) {
				 System.out.println("The value is"+value);
			 }
			 
			 String str=" Clean World,Green World,Happy World";
			 String []arr1=str.split("");
			 HashMap<String,Integer>Map1=new HashMap <String,Integer>();
			 
			 for(String Word:arr1 ) {
					if(!Map1.keySet().contains(Word)) {
						Map1.put(Word, 1);
					}else {	
						Map1.put(Word, Map1.get(Word)+1);
					}
				}
				
				System.out.println("The resulting map  is " + Map1);
			 }
			 
			 
			 
			 
		 }	
		 
		 
	}

}
