package wordCountUsingMap;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {

			//Declaring the Arraylist with String values
			String[] strAr1 = new String[]{"Anagha","Anagha","Beneetha","Anagha","Sreya","Alka","Raj","Alka"};
			//Declaring a HashMap of <String,Integer>
			Map<String, Integer> hashMap = new HashMap<String, Integer>();
			
			for (String word : strAr1) {
				// Asking whether the HashMap contains the
	            // key or not. Will return null if not.
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                // Storing the word as key and its
	                // occurrence as value in the HashMap.
	                hashMap.put(word, 1);
	 
	            else {
	                // Incrementing the value if the word
	                // is already present in the HashMap.
	                hashMap.put(word, integer + 1);
	            }
			}
			System.out.println(hashMap);
			}
 }
		
		